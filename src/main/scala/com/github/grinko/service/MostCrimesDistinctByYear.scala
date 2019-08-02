package com.github.grinko.service

import com.github.grinko.entities.Metrics

class MostCrimesDistinctByYear {
  def apply(metrics: List[Metrics], year: Int): String = {
    metrics.filter(_.year.equals(Some(year))).groupBy(_.district)
      .map{ case (distinct, crimesList )=> (distinct, crimesList.size)}.toMap
      .maxBy(_._2)._1
  }
}
