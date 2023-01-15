package com.baeldung.scalapy

import me.shadaj.scalapy.py
import me.shadaj.scalapy.py.SeqConverters

object ScalaPyDemo {
  def main(args: Array[String]) = {
    val listLengthPython = py.Dynamic.global.len(List(1, 2, 3).toPythonProxy)
    println(listLengthPython)
  // listLengthPython: py.Dynamic = 3
  }
}