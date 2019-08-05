package scala.com.github.grinko.service

import com.github.grinko.entities.MetricsRaw
import com.github.grinko.service.MostCrimesStreet
import com.github.grinko.util.{ConvertionMetricsUtil, CsvFileUtil}
import org.scalatest.FlatSpec

import scala.com.github.grinko.testdata

class MostCrimesStreetTest extends FlatSpec{

  "Calculation method" should "get most crimes street" in {
    val testList = new ConvertionMetricsUtil().rawMetricsToMetrics(testdata.rawMetrics)
    val result = "LINCOLN ST"
    assert( new MostCrimesStreet()(testList) === result)
  }
}
