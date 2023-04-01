import com.sample.Utils
import org.apache.spark.sql.SparkSession
// Databricks notebook source
object Databricks {

  def main(args: Array[String]): Unit = {


    val spark = SparkSession.builder().master("local[*]")
                            .getOrCreate()

    import spark.implicits._

    val df  = Utils(spark).getDf

    df.show(false)


  }
}
