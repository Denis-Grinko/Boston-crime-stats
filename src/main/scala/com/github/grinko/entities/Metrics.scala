package com.github.grinko.entities

import java.util.Date

case class Metrics(
  incidentNumber: String,
  offenseCode: Option[Int],
  offenseCodeGroup: String,
  offenseDescription: String,
  district: String,
  reportingArea: Option[Int],
  shooting: Boolean,
  occurredOnDate: Date,
  year: Int,
  month: Int,
  dayOfWeek: String,
  hour: Int,
  ucrPart: String,
  street: String,
  lat: Option[Double],
  long: Option[Double],
  location: String) {

}
