package scala.com.github.grinko.util


import com.github.grinko.service.MostCrimesDayTime
import com.github.grinko.util.{ConvertionMetricsUtil, CsvFileUtil}
import org.scalatest.FlatSpec

class ConvertionMetricsUtilTest extends  FlatSpec {

  "Convertion method" should "convert String to Object[Int]" in {
    val testString = "123"
    val result = Option[Int](123)
    assert( new ConvertionMetricsUtil().stringToInt(testString) === result)
  }

  "Convertion method" should "convert String to Object[Double]" in {
    val testString = "123.456"
    val result = Option[Double](123.456)
    assert( new ConvertionMetricsUtil().stringToDouble(testString) === result)
  }


}
