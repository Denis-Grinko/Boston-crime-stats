package com.github.grinko.controllers

import com.github.grinko.entities.Metrics
import com.github.grinko.service._

class TransformController {

  def getMostCrimesDayTime(metrics: List[Metrics]): Option[Int] = {
    new MostCrimesDayTime()(metrics)
  }

  def getMostCrimesStreet(metrics: List[Metrics]): String ={
    new MostCrimesStreet()(metrics)
  }

  def getMostCrimesDistinctByYear(metrics: List[Metrics], year: Int): String ={
    new MostCrimesDistinctByYear()(metrics, year)
  }

  def getNumberCrimesForAllYear(metrics: List[Metrics]): Map[Option[Int], Int] = {
    new NumberCrimesForAllYear()(metrics)
  }

  def getNumberOfCrimesEachMounthInEachYear(metrics: List[Metrics]): Map[Option[Int], Map[Option[Int], Int]] = {
    new NumberOfCrimesEachMounthInEachYear()(metrics)
  }
}
