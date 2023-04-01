// Databricks notebook source

package com.sample

import org.apache.spark.sql.SparkSession

class Utils(spark:SparkSession) {

  import spark.implicits._
  def getDf={
    Seq(("Kiran", 1)).toDF("name","id")
  }

}

object Utils{

  def apply(spark: SparkSession): Utils = new Utils(spark)
}
