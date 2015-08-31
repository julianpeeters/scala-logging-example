package example


import com.typesafe.scalalogging._


object A extends LazyLogging {
  logger.info("I confess, I do not believe in time.")
  def greet = println("Hello World")
}

object Example extends App {
  A.greet
}
