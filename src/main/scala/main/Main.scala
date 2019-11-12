package main

import a._
import a.A._

object Main {
    def main(args: Array[String]): Unit = {
      val a1 = A.B.C(0)
      val a2 = B.C(0)
      println(a1, a2)
    }
  
  }