package com.github.grinko.service

import com.github.grinko.entities.Metrics

class MostCrimesDistinctByYear {
  def calc(metrics: List[Metrics], year: Int): String = {
    metrics.filter(_.year.equals(year)).groupBy(_.district)
      .map{ case (distinct, crimesList )=> (distinct, crimesList.size)}.toMap
      .maxBy{ case (distinct, crimesNumber) => crimesNumber}._1
  }
}
