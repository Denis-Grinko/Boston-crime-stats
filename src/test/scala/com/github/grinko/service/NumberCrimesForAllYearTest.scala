package scala.com.github.grinko.service

import com.github.grinko.service.NumberCrimesForAllYear
import com.github.grinko.util.{ConvertionMetricsUtil, CsvFileUtil}
import org.scalatest.FlatSpec

class NumberCrimesForAllYearTest extends FlatSpec{

  "Calculation method" should "get number crimes for all year" in {
    val testList = new ConvertionMetricsUtil().rawMetricsToMetrics(new CsvFileUtil().read("testData"))
    val result = Map(Some(2018) -> 15)
    assert( new NumberCrimesForAllYear().apply(testList) === result)
  }
}
