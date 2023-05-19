package com.typeduke.helloworld

import org.scalatest.funsuite.AnyFunSuite

class HelloWorldTest extends AnyFunSuite {
  test("The sayHello() method should return \"Hello, world.\"") {
    val returned = HelloWorld.sayHello()
    val expected = "Hello, world."

    assert(returned == expected)
  }
}
