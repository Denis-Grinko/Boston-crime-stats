package com.github.grinko

import com.github.grinko.entities.{Metrics, MetricsRaw}
import com.github.grinko.service.MostCrimesStreet
import com.github.grinko.util.CsvFileUtil

object Application {
  def main(args: Array[String]): Unit = {
    val fileName = "testData.csv"
    val reader = new CsvFileUtil
    val metrics = rawMetricsToMetrics(reader.read(fileName))
    println(metrics.map(_.toStringList()))
    val writeFile = "write.csv"
    reader.write(writeFile, metrics.map(_.toStringList()))

  }

  def rawMetricsToMetrics(rawMetrics: List[MetricsRaw]): List[Metrics] = {
    rawMetrics.map(new Metrics(_))
  }
}
