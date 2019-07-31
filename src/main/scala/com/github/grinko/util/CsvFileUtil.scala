package com.github.grinko.util


import com.github.grinko.entities.{Metrics, MetricsRaw}
import com.github.tototoshi.csv.{CSVReader, CSVWriter}

import scala.io.Source

class CsvFIleUtil {
  val INCIDENT_NUMBER: Int = 0
  val OFFENSE_CODE: Int = 1
  val OFFENSE_CODE_GROUP: Int = 2
  val OFFENSE_DESCRIPTION: Int = 3
  val DISTRICT: Int = 4
  val REPORTING_AREA: Int = 5
  val SHOOTING: Int = 6
  val OCCURRED_ON_DATE: Int = 7
  val YEAR: Int = 8
  val MONTH: Int = 9
  val DAY_OF_WEEK: Int = 10
  val HOUR: Int = 11
  val UCR_PART: Int = 12
  val STREET: Int = 13
  val LAT: Int = 14
  val LONG: Int = 15
  val LOCATION: Int = 16

  def read(fileName: String): List[MetricsRaw] = {
    val reader = CSVReader.open(fileName)
    val metrics = reader.all()
    metrics.map(list => MetricsRaw(list(INCIDENT_NUMBER), list(OFFENSE_CODE), list(OFFENSE_CODE_GROUP),
      list(OFFENSE_DESCRIPTION), list(DISTRICT), list(REPORTING_AREA), list(SHOOTING), list(OCCURRED_ON_DATE),
      list(YEAR), list(MONTH), list(DAY_OF_WEEK), list(HOUR), list(UCR_PART), list(STREET), list(LAT), list(LONG),
      list(LOCATION) )).toList
  }

  def write(fileName: String, metrics: List[List[String]]): Unit ={
    val writer = CSVWriter.open(fileName)
    writer.writeAll(metrics)
  }
}
