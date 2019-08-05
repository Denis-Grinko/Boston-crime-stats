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
                    year: Option[Int],
                    month: Option[Int],
                    dayOfWeek: String,
                    hour: Option[Int],
                    ucrPart: String,
                    street: String,
                    lat: Option[Double],
                    long: Option[Double],
                    location: String) {
}

case class MetricsRaw(incidentNumber: String,
                      offenseCode: String,
                      offenseCodeGroup: String,
                      offenseDescription: String,
                      district: String,
                      reportingArea: String,
                      shooting: String,
                      occurredOnDate: String,
                      year: String,
                      month: String,
                      dayOfWeek: String,
                      hour: String,
                      ucrPart: String,
                      street: String,
                      lat: String,
                      long: String,
                      location: String) {

}