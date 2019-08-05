package com.github.grinko.service

import com.github.grinko.entities.Metrics
import com.github.grinko.util.{ConvertionMetricsUtil, CsvFileUtil}

object WriteMetricsFileWithTitles {
  def apply(metrics: List[Metrics], fileName: String): Unit ={
    val titlesList = List("INCIDENT_NUMBER",
                          "OFFENSE_CODE",
                          "OFFENSE_CODE_GROUP",
                          "OFFENSE_DESCRIPTION",
                          "DISTRICT",
                          "REPORTING_AREA",
                          "SHOOTING",
                          "OCCURRED_ON_DATE",
                          "YEAR",
                          "MONTH",
                          "DAY_OF_WEEK",
                          "HOUR",
                          "UCR_PART",
                          "STREET",
                          "LAT",
                          "LONG",
                          "LOCATION")
    val csvFileUtil = new CsvFileUtil
    csvFileUtil.write(fileName, List(titlesList))
    csvFileUtil.write(fileName,metrics.map(metric => new ConvertionMetricsUtil().metricToList(metric)))
  }
}
