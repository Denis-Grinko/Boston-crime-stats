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
       isShooting(metric.shooting),
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

  def isShooting(string: String): Boolean = {
    if(string.isEmpty){
      false
    } else {
      true
    }
  }

}
