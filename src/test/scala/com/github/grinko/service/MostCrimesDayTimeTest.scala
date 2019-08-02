package scala.com.github.grinko.service

import com.github.grinko.service.MostCrimesDayTime
import com.github.grinko.util.{ConvertionMetricsUtil, CsvFileUtil}
import org.scalatest.FlatSpec

class MostCrimesDayTimeTest extends  FlatSpec {

  "Calculation method" should "get most crimes day time" in {
    val testList = new ConvertionMetricsUtil().rawMetricsToMetrics(new CsvFileUtil().read("testData"))
    val result = Option[Int](20)
    assert( new MostCrimesDayTime().apply(testList) === result)
  }
}
