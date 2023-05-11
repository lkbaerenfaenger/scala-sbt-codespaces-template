package com.typeduke.helloworld

object HelloWorld {
  def sayHello(): String =
    "Hello, world."

  def main(args: Array[String]): Unit =
    println(sayHello())
}
