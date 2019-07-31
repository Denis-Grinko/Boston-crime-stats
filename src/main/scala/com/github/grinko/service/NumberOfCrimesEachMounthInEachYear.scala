package com.github.grinko.service

import com.github.grinko.entities.Metrics

class NumberOfCrimesEachMounthInEachYear {
  def calc(metrics: List[Metrics]): Map[Int, Map[Int, Int]] = {
    metrics.groupBy(_.year)
      .map(elem => (elem._1, elem._2.groupBy(_.month).map(elem => (elem._1, elem._2.size)).toMap)).toMap
  }
}
