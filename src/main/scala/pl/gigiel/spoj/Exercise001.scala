package pl.gigiel.spoj

// TEST - Life, the Universe, and Everything
object Exercise001 extends App {
  def fun(): Unit = {
    val n = scala.io.StdIn.readInt
    if (n != 42) {
      println(n)
      fun
    }
  }
  fun
}
