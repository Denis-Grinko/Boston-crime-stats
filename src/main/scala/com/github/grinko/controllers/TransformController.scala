package com.github.grinko.controllers

import com.github.grinko.entities.Metrics
import com.github.grinko.service._

class TransformController {

  def getMostCrimesDayTime(metrics: List[Metrics]): Option[Int] = {
    new MostCrimesDayTime().apply(metrics)
  }

  def getMostCrimesStreet(metrics: List[Metrics]): String ={
    new MostCrimesStreet().apply(metrics)
  }

  def getMostCrimesDistinctByYear(metrics: List[Metrics], year: Int): String ={
    new MostCrimesDistinctByYear().apply(metrics, year)
  }

  def getNumberCrimesForAllYear(metrics: List[Metrics]): Map[Option[Int], Int] = {
    new NumberCrimesForAllYear().apply(metrics)
  }

  def getNumberOfCrimesEachMounthInEachYear(metrics: List[Metrics]): Map[Option[Int], Map[Option[Int], Int]] = {
    new NumberOfCrimesEachMounthInEachYear().apply(metrics)
  }
}
