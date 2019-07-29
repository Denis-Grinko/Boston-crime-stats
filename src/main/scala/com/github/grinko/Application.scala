package com.github.grinko

import com.github.grinko.entities.Metrics
import com.github.grinko.util.CsvReader

object Application {
  def main(args: Array[String]): Unit = {
    val reader = new CsvReader
    val metrics: List[Metrics] = reader.read("crime.csv")

  }
}
