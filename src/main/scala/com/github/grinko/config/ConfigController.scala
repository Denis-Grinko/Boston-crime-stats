package com.github.grinko.config

import com.typesafe.config.ConfigFactory
import java.io.File

object ConfigController {
  private val CONFIG_PATH = "config.properties"
  private val confirFactory = ConfigFactory.parseFile(new File(CONFIG_PATH))

  val csvFilePath = confirFactory.getString("file-path")
}
