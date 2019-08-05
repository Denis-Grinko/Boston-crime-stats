package scala.com.github.grinko.service

import com.github.grinko.entities.MetricsRaw
import com.github.grinko.service.MostCrimesDayTime
import com.github.grinko.util.{ConvertionMetricsUtil, CsvFileUtil}
import org.scalatest.FlatSpec

import scala.com.github.grinko.testdata

class MostCrimesDayTimeTest extends  FlatSpec {
    "Calculation method" should "get most crimes day time" in {
    val testList = new ConvertionMetricsUtil().rawMetricsToMetrics(testdata.rawMetrics)
    val result = Option[Int](20)
    assert( new MostCrimesDayTime()(testList) === result)
  }
}
