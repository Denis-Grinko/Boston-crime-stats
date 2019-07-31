package com.github.grinko.util


import com.github.grinko.entities.Metrics
import com.github.tototoshi.csv.CSVReader

import scala.io.Source

class CsvReader {
  def read(fileName: String): List[Metrics] = {
    val fileSource = Source.fromFile(fileName)
    val reader = CSVReader.open(fileName)
    val metrics = reader.all()
    metrics.map(list => Metrics(list(0), list(1), list(2), list(3), list(4), list(5), list(6), list(7),
      list(8), list(9), list(10), list(11), list(12), list(13), list(14), list(15), list(16) )).toList
  }
}
