package com.github.grinko.controllers

import com.github.grinko.entities.Metrics
import com.github.grinko.service._

class TransformController {

  def getMostCrimesDayTime(metrics: List[Metrics]): Int = {
    new MostCrimesDayTime().calc(metrics)
  }

  def getMostCrimesStreet(metrics: List[Metrics]): String ={
    new MostCrimesStreet().calc(metrics)
  }

  def getMostCrimesDistinctByYear(metrics: List[Metrics], year: Int): String ={
    new MostCrimesDistinctByYear().calc(metrics, year)
  }

  def getNumberCrimesForAllYear(metrics: List[Metrics]): Map[Int, Int] = {
    new NumberCrimesForAllYear().calc(metrics)
  }

  def getNumberOfCrimesEachMounthInEachYear(metrics: List[Metrics]): Map[Int, Map[Int, Int]] = {
    new NumberOfCrimesEachMounthInEachYear().calc(metrics)
  }
}
