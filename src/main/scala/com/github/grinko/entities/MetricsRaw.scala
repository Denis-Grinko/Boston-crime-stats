package com.github.grinko.entities

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
