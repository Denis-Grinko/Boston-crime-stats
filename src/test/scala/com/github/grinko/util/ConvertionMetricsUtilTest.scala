package scala.com.github.grinko.util


import com.github.grinko.entities.MetricsRaw
import com.github.grinko.service.MostCrimesDayTime
import com.github.grinko.util.{ConvertionMetricsUtil, CsvFileUtil}
import org.scalatest.FlatSpec

import scala.com.github.grinko.testdata

class ConvertionMetricsUtilTest extends  FlatSpec {

  "Convertion method" should "convert String to Option[Int]" in {
    val testString = "123"
    val result = Option[Int](123)
    assert( new ConvertionMetricsUtil().stringToInt(testString) === result)
  }

  "Convertion method" should "convert String to Option[Double]" in {
    val testString = "123.456"
    val result = Option[Double](123.456)
    assert( new ConvertionMetricsUtil().stringToDouble(testString) === result)
  }

  "Convertion method" should "convert data string to Data" in {
    val testString = "2018-09-03 19:27:00"
    val dataFormatString = "yyyy-MM-dd hh:mm:ss"
    val result = "Mon Sep 03 19:27:00 MSK 2018"
    assert( new ConvertionMetricsUtil().stringToDate(testString, dataFormatString).toString === result)
  }

  "Convertion method" should "convert metrics to fields list" in {
    val testMetrics =  new ConvertionMetricsUtil().rawMetricsToMetrics(testdata.rawMetrics)
    val result = List("I182070945", "Some(619)", "Larceny", "LARCENY ALL OTHERS", "D14", "Some(808)", "true",
      "Sun Sep 02 13:00:00 MSK 2018", "Some(2018)", "Some(9)", "Sunday", "Some(13)", "Part One", "LINCOLN ST",
      "Some(42.35779134)", "Some(-71.13937053)", "(42.35779134, -71.13937053)")
    assert( new ConvertionMetricsUtil().metricToList(testMetrics.head) === result)
  }

}
