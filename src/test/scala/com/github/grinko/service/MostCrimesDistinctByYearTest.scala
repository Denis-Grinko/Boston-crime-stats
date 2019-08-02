package scala.com.github.grinko.service

import com.github.grinko.service.MostCrimesDistinctByYear
import com.github.grinko.util.{ConvertionMetricsUtil, CsvFileUtil}
import org.scalatest.FlatSpec

class MostCrimesDistinctByYearTest extends FlatSpec{

  "Calculation method" should "get most crimes distinct by year" in {
    val testList = new ConvertionMetricsUtil().rawMetricsToMetrics(new CsvFileUtil().read("testData"))
    val result = "C6"
    assert( new MostCrimesDistinctByYear().apply(testList, 2018) === result)
  }
}
