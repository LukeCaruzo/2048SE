package de.htwg.se.twothousandfortyeight.controller

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import akka.util.Timeout

import scala.concurrent.duration.DurationInt
import scala.language.postfixOps

package object actorInternalDslImpl {
  implicit val timeout = Timeout(5 seconds)
  implicit val system = ActorSystem("system")
  implicit val materializer = ActorMaterializer()
  implicit val executionContext = system.dispatcher

  val Player = new Player

  val UP = "w"
  val LEFT = "a"
  val DOWN = "s"
  val RIGHT = "d"
  val UNDO = "q"
  val RESET = "r"
  val SAVE = "z"
  val LOAD = "u"
  val EXIT = "t"
  val HELP = "h"
}
