package com.github.grinko.entities

import java.text.SimpleDateFormat
import java.util.Date

class Metrics(metricsRaw: MetricsRaw) {
  val incidentNumber: String = metricsRaw.incidentNumber
  val offenseCode: Option[Int] = parseOffenceCode()
  val offenseCodeGroup: String = metricsRaw.offenseCodeGroup
  val offenseDescription: String = metricsRaw.offenseDescription
  val district: String = metricsRaw.district
  val reportingArea: Option[Int] = parseReportingArea()
  val shooting: Boolean = parseShooting()
  val occurredOnDate: Date = parseDate()
  val year: Int = occurredOnDate.getYear
  val month: Int = occurredOnDate.getMonth
  val dayOfWeek: String = metricsRaw.dayOfWeek
  val hour: Int = occurredOnDate.getHours
  val ucrPart: String = metricsRaw.ucrPart
  val street: String = metricsRaw.street
  val lat: Option[Double] = parseLat()
  val long: Option[Double] = parseLong()
  val location: String = metricsRaw.location

  private def parseOffenceCode(): Option[Int] = {
    try {
      Some(metricsRaw.offenseCode.toInt)
    } catch {
      case e: NumberFormatException => None
    }
  }

  private def parseReportingArea(): Option[Int] = {
    try{
      Some(metricsRaw.reportingArea.toInt)
    } catch {
      case e: NumberFormatException => None
    }

  }

  private def stringToOptionInt(string: String): Option[Int] = {
    try{
      Some(string.toInt)
    } catch {
      case e: NumberFormatException => None
    }
  }

  private def parseShooting(): Boolean = {
    if (metricsRaw.shooting == null){
      false
    }
    else{
      true
    }
  }

  private def parseDate(): Date = {
    lazy val DATE_FORMAT = "yyyy-MM-dd hh:mm:ss"

    val dateFormat = new SimpleDateFormat(DATE_FORMAT)
    dateFormat.parse(metricsRaw.occurredOnDate)
  }

  private def parseLat(): Option[Double] = {
    try{
      Some(metricsRaw.lat.toDouble)
    } catch {
      case e: NumberFormatException => None
    }
  }

  private def parseLong(): Option[Double] = {
    try {
      Some(metricsRaw.long.toDouble)
    } catch {
      case e: NumberFormatException =>None
    }
  }

  def toStringList(): List[String] = {
    List[String](incidentNumber, offenseCode.toString, offenseCodeGroup, offenseDescription, district, reportingArea.toString,
      shooting.toString, occurredOnDate.toString, year.toString, month.toString, dayOfWeek, hour.toString, ucrPart,
      street, lat.toString, long.toString, location)
  }
}
