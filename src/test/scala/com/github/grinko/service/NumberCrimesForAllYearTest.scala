package scala.com.github.grinko.service

import com.github.grinko.service.NumberCrimesForAllYear
import com.github.grinko.util.{ConvertionMetricsUtil, CsvFileUtil}
import org.scalatest.FlatSpec

import scala.com.github.grinko.testdata

class NumberCrimesForAllYearTest extends FlatSpec{

  "Calculation method" should "get number crimes for all year" in {
    val testList = new ConvertionMetricsUtil().rawMetricsToMetrics(testdata.rawMetrics)
    val result = Map(Some(2018) -> 15)
    assert( new NumberCrimesForAllYear()(testList) === result)
  }
}
