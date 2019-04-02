package de.htwg.se.twothousandfortyeight.model

import de.htwg.se.twothousandfortyeight.model.gameModel.gameBaseImpl.{Game, Grid, Tile}
import org.junit.runner.RunWith
import org.scalatest._
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class GameSpec extends WordSpec with Matchers {
  "A Game" when {
    "new" should {
      val game = new Game
      game.status.grid = new Grid(0.3, 0.5, 0.7, 0.2)
      "have a left method" in {
        game.left(0.5, 0.3)
        game.status.grid.tiles should be(Array(new Tile(0), new Tile(0), new Tile(0), new Tile(0), new Tile(2), new Tile(0), new Tile(0), new Tile(0), new Tile(2), new Tile(2), new Tile(0), new Tile(0), new Tile(0), new Tile(0), new Tile(0), new Tile(0)))
        game.status.score.value should be(0)
      }
      "have a right method" in {
        game.right(0.2, 0.9)
        game.status.grid.tiles should be(Array(new Tile(0), new Tile(0), new Tile(0), new Tile(0), new Tile(0), new Tile(0), new Tile(0), new Tile(2), new Tile(0), new Tile(0), new Tile(0), new Tile(4), new Tile(0), new Tile(4), new Tile(0), new Tile(0)))
        game.status.score.value should be(4)
      }
      "have a down method" in {
        game.down(0.7, 0.4)
        game.status.grid.tiles should be(Array(new Tile(0), new Tile(0), new Tile(0), new Tile(0), new Tile(0), new Tile(0), new Tile(2), new Tile(0), new Tile(0), new Tile(0), new Tile(0), new Tile(2), new Tile(0), new Tile(4), new Tile(0), new Tile(4)))
        game.status.score.value should be(4)
      }
      "have a up method" in {
        game.up(0.8, 0.1)
        game.status.grid.tiles should be(Array(new Tile(0), new Tile(4), new Tile(2), new Tile(2), new Tile(2), new Tile(0), new Tile(0), new Tile(4), new Tile(0), new Tile(0), new Tile(0), new Tile(0), new Tile(0), new Tile(0), new Tile(0), new Tile(0)))
        game.status.score.value should be(4)
      }
      "have a moveSingleLine method" in {
        game.moveSingleLine(game.status.grid.getSingleLine(1)) should be(Array(new Tile(2), new Tile(4), new Tile(0), new Tile(0)))
      }
      "have a mergeSingleLine method" in {
        game.mergeSingleLine(game.status.grid.getSingleLine(1)) should be(Array(new Tile(2), new Tile(0), new Tile(0), new Tile(0)))
      }
      "have a compareLines method" in {
        game.compareLines(game.status.grid.getSingleLine(1), game.status.grid.getSingleLine(1)) should be(true)
        game.compareLines(game.status.grid.getSingleLine(1), game.status.grid.getSingleLine(2)) should be(false)
        game.compareLines(game.status.grid.getSingleLine(1), Array(new Tile(2), new Tile(4), new Tile(0))) should be(false)
      }
      val game2 = new Game
      "have a reset method" in {
        game2.status.score.value = 5
        game2.status.score.value should be(5)
        game2.reset
        game2.status.score.value should be(0)
      }
    }
  }
}
