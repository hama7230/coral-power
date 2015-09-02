package jp.co.atware.coralpower

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}
import org.scalatest._

class ExampleSpec extends FlatSpec with MustMatchers with BeforeAndAfter {

  private val master = "local[2]"
  private val appName = "test-spark"
  private var sc: SparkContext = _

  before {
    val conf = new SparkConf()
      .setMaster(master)
      .setAppName(appName)
    sc = new SparkContext(conf)
  }

  after {
    if (sc != null) {
      sc.stop()
    }
  }

  "Test Function" should "be performed" in {
    val input = List(1,2,3,4,5,6,7,8)

    val rdd = sc.parallelize(input)

    val count = rdd.count()

    count mustBe 8
  }
}
