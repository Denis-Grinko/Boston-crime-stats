package com.github.grinko.service

import com.github.grinko.entities.{Metrics, MetricsRaw}

class MostCrimesStreet {
  def calc(metrics: List[Metrics]): String = {
    metrics.groupBy(_.street).map(elem => (elem._1, elem._2.size)).toMap.maxBy(_._2)._1
  }
}
