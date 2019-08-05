package scala.com.github.grinko.service

import com.github.grinko.entities.MetricsRaw
import com.github.grinko.service.MostCrimesDistinctByYear
import com.github.grinko.util.{ConvertionMetricsUtil, CsvFileUtil}
import org.scalatest.FlatSpec

import scala.com.github.grinko.testdata

class MostCrimesDistinctByYearTest extends FlatSpec{
    "Calculation method" should "get most crimes distinct by year" in {
    val testList = new ConvertionMetricsUtil().rawMetricsToMetrics(testdata.rawMetrics)
    val result = "C6"
    assert( new MostCrimesDistinctByYear()(testList, 2018) === result)
  }
}
