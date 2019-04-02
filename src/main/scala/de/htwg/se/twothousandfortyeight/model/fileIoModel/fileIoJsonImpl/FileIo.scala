package de.htwg.se.twothousandfortyeight.model.fileIoModel.fileIoJsonImpl

import java.io._

import com.google.gson.Gson
import de.htwg.se.twothousandfortyeight.model.fileIoModel.FileIoTrait
import de.htwg.se.twothousandfortyeight.model.gameModel.GameTrait
import de.htwg.se.twothousandfortyeight.model.gameModel.gameBaseImpl.{Game, GameStatus}

import scala.io.Source

class FileIo extends FileIoTrait {
  def save(filename: String, game: GameTrait) {
    val file = new File(filename + ".json")
    val bw = new BufferedWriter(new FileWriter(file))

    val gson = new Gson
    bw.write(gson.toJson(game))
    bw.close()
  }

  def load(filename: String, game: GameTrait) {
    val source = Source.fromFile(filename + ".json")
    val lines = try source.mkString finally source.close()

    val gson = new Gson
    val jsonGame = gson.fromJson(lines, classOf[Game])

    game.status.score = jsonGame.status.score
    game.status.grid = jsonGame.status.grid
  }
}
