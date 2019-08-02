package scala.com.github.grinko.service

import com.github.grinko.service._
import com.github.grinko.util.{ConvertionMetricsUtil, CsvFileUtil}
import org.scalatest.FlatSpec

class NumberOfCrimesEachMonthEachYearTest extends FlatSpec{

  "Calculation method" should "get number crimes for all month all year" in {
    val testList = new ConvertionMetricsUtil().rawMetricsToMetrics(new CsvFileUtil().read("testData"))
    val result = Map(Some(2018) -> Map(Some(8) -> 1, Some(9) -> 14))
    assert( new NumberOfCrimesEachMounthInEachYear().apply(testList) === result)
  }
}
