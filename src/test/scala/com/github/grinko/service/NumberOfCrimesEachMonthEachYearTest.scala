package scala.com.github.grinko.service

import com.github.grinko.entities.MetricsRaw
import com.github.grinko.service._
import com.github.grinko.util.{ConvertionMetricsUtil, CsvFileUtil}
import org.scalatest.FlatSpec

import scala.com.github.grinko.testdata

class NumberOfCrimesEachMonthEachYearTest extends FlatSpec{

  "Calculation method" should "get number crimes for all month all year" in {
    val testList = new ConvertionMetricsUtil().rawMetricsToMetrics(testdata.rawMetrics)
    val result = Map(Some(2018) -> Map(Some(8) -> 1, Some(9) -> 14))
    assert( new NumberOfCrimesEachMounthInEachYear()(testList) === result)
  }
}
