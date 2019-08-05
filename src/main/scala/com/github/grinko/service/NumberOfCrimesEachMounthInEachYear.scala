package com.github.grinko.service

import com.github.grinko.entities.Metrics

class NumberOfCrimesEachMounthInEachYear {
  def apply(metrics: List[Metrics]): Map[Option[Int], Map[Option[Int], Int]] = {
    metrics.groupBy(_.year)
      .map{ case (year, metricList) => (year, metricList
        .groupBy(_.month)
        .map{case (month, crimesList) => (month, crimesList.size)}
        .toMap)}
      .toMap
  }
}
