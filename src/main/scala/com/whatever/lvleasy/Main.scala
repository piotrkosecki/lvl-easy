package com.whatever.lvleasy

import scala.concurrent.Future
import concurrent.ExecutionContext.Implicits.global

object Main {

  def main(args: Array[String]): Unit = {
    println("dupa")


    val f1: Future[Int] = Future {
      println("AAAAA")
      1
    }
    val f2: Future[Int] = Future {
      println("BBBBB")
      2
    }

    f1.flatMap(x => f2.map(y => x + y)).foreach(println)

  }

}
