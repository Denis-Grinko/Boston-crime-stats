package com.github.grinko.service

import com.github.grinko.entities.Metrics

class NumberCrimesForAllYear {
  def apply(metrics: List[Metrics]): Map[Option[Int], Int] = {
    metrics.groupBy(_.year).map{case (year, crimesList) => (year, crimesList.size)}.toMap
  }
}
