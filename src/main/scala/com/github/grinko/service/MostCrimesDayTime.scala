package com.github.grinko.service

import com.github.grinko.entities.Metrics

class MostCrimesDayTime {
  def apply(metrics: List[Metrics]): Option[Int] = {
    metrics.groupBy(_.hour).map(elem => (elem._1, elem._2.size)).toMap.maxBy(_._2)._1
  }
}
