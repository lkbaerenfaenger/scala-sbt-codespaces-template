package com.typeduke

import org.scalatest.funsuite.AnyFunSuite

class SimpleTest extends AnyFunSuite {
  test("Compare two strings ignoring case") {
    val calculatedString = "TypeDuke"
    val expectedString = "typeduke"

    assert(calculatedString.toLowerCase == expectedString)
  }
}
