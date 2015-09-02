package jp.co.atware.coralpower

import org.slf4j.LoggerFactory


object Main extends Loggable {

  def main(args: Array[String]) {

    logger info "Coral Power!"
  }
}

trait Loggable {

  val logger = LoggerFactory.getLogger(getClass)
}
