package com.github.grinko.service

import com.github.grinko.entities.{Metrics, MetricsRaw}

class MostCrimesStreet {
  def calc(metrics: List[Metrics]): String = {
    metrics.groupBy(_.street).map{ case (street, crimesList) => (street, crimesList.size)}
      .toMap.maxBy{ case (street, crimesNumber) => crimesNumber}._1
  }
}
