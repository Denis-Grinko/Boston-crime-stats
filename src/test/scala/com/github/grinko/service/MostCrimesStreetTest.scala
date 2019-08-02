package scala.com.github.grinko.service

import com.github.grinko.service.MostCrimesStreet
import com.github.grinko.util.{ConvertionMetricsUtil, CsvFileUtil}
import org.scalatest.FlatSpec

class MostCrimesStreetTest extends FlatSpec{

  "Calculation method" should "get most crimes street" in {
    val testList = new ConvertionMetricsUtil().rawMetricsToMetrics(new CsvFileUtil().read("testData"))
    val result = "LINCOLN ST"
    assert( new MostCrimesStreet().apply(testList) === result)
  }
}
