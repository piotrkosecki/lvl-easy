package com.whatever.lvleasy

import com.whatever.lvleasy.Main.Show

import scala.concurrent.Future
import concurrent.ExecutionContext.Implicits.global




object Main {


  trait Show[A] {
    def show(a: A): String
  }

  case class Dog(name: String)


  def main(args: Array[String]): Unit = {


    val d = Dog("azor")
    implicit val sth: Show[Dog] = new Show[Dog] {
      override def show(a: Dog): String = s"Aport ${a.name}!"
    }


    println(sth.show(d))


//    println("dupa")
    //
    //
//        val f1: Future[Int] = Future {
//          println("AAAAA")
//          1
//        }
    //    val f2: Future[Int] = Future {
    //      println("BBBBB")
    //      2
    //    }
    //
    //    f1.flatMap(x => f2.map(y => x + y)).foreach(println)

    //    val sth = 1 * 2 * 5


    //    val sth = Option(1)
    //
    //    sth match {
    //      case Some(value) =>
    //      case None =>
    //    }

//    val o1 = Option(1)
//    val o2 = Option(2)
//    val o3 = Option(3)
//
//    o1.flatMap(x => o2.flatMap(y => o3.map(z => x + y + z) )).foreach(println)
//
//    val sth = for {
//      oo1 <- o1
//      oo2 <- o2
//      oo3 <- o3
//    } yield oo1 + oo2 + oo3


//    def foo(i: String): Int = {
//      i.toInt + 5
//    }
//
//    implicit def sth(i: Int): String = i.toString
//
//    println(foo(10))

//    implicit class JakasKlasa(str: String) {
//      def addDupa(): String = str + " DUPA!"
//    }
//
//    println("Ala i".addDupa())
//    List(1,2,3).map(_ + 1).map(_.toString).map(_.addDupa())



  }

}
