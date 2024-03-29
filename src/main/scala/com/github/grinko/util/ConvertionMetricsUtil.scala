package com.github.grinko.util

import java.text.SimpleDateFormat
import java.util.Date

import com.github.grinko.entities.{Metrics, MetricsRaw}

import scala.util.Try

class ConvertionMetricsUtil {
  lazy val DATE_FORMAT: String = "yyyy-MM-dd hh:mm:ss"

  def rawMetricsToMetrics(metrics: List[MetricsRaw]): List[Metrics] = {
     metrics.map(metric => new Metrics(
       metric.incidentNumber,
       stringToInt(metric.offenseCode),
       metric.offenseCodeGroup,
       metric.offenseDescription,
       metric.district,
       stringToInt(metric.reportingArea),
       metric.shooting.isEmpty,
       stringToDate(metric.occurredOnDate, DATE_FORMAT),
       stringToInt(metric.year),
       stringToInt(metric.month),
       metric.dayOfWeek,
       stringToInt(metric.hour),
       metric.ucrPart,
       metric.street,
       stringToDouble(metric.lat),
       stringToDouble(metric.long),
       metric.location
     ))
  }

  def stringToInt(string: String): Option[Int] = {
    Try(string.toInt).toOption
  }

  def stringToDouble(string: String): Option[Double] = {
    Try(string.toDouble).toOption
  }

  def stringToDate(string: String, dateFormat: String): Date = {
    val simpleDateFormat = new SimpleDateFormat(dateFormat)
    simpleDateFormat.parse(string)
  }

  def metricToList(metrics: Metrics): List[String] = {
    List[String](metrics.incidentNumber, metrics.offenseCode.toString, metrics.offenseCodeGroup,
      metrics.offenseDescription, metrics.district, metrics.reportingArea.toString,metrics.shooting.toString,
      metrics.occurredOnDate.toString, metrics.year.toString, metrics.month.toString, metrics.dayOfWeek,
      metrics.hour.toString, metrics.ucrPart, metrics.street, metrics.lat.toString, metrics.long.toString, metrics.location)
  }
}
