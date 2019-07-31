package com.github.grinko.service

import com.github.grinko.entities.Metrics

class NumberCrimesForAllYear {
  def calc(metrics: List[Metrics]): Map[Int, Int] = {
    metrics.groupBy(_.year).map(elem => (elem._1, elem._2.size)).toMap
  }
}
