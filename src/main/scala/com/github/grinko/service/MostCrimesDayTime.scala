package com.github.grinko.service

import com.github.grinko.entities.Metrics

class MostCrimesDayTime {
  def apply(metrics: List[Metrics]): Int = {
    metrics.groupBy(_.hour).map{ case (hour, listCrimes) => (hour, listCrimes.size)}.toMap
      .maxBy{case (_, numberCrimes) => numberCrimes}._1
  }
}
