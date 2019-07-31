package com.github.grinko.service

import com.github.grinko.entities.Metrics

class MostCrimesDistinctByYear {
  def calc(metrics: List[Metrics], year: Int): String = {
    metrics.filter(_.year.equals(year)).groupBy(_.district).map(elem => (elem._1, elem._2.size)).toMap.maxBy(_._2)._1
  }
}
