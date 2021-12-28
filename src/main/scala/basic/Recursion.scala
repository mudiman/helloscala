package basic

object Recursion extends App {
  def concatString(str: String, n: Int, accumulator: String): String = {
    if (n <= 0) then accumulator
    else {
      concatString(str, n - 1, str + accumulator)
    }
  }

  println(concatString("a ", 10, ""))

  def isPrime(n: Int): Boolean = {
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)

    isPrimeTailrec(n/2, true)
  }
  println(isPrime(2003))

  def fibononacci(n: Int): Int = {
    def fiboTailrec(i: Int, last: Int, nextToLast: Int): Int =
      if (i >= n ) last
      else fiboTailrec(i + 1, last + nextToLast, last)

    if (n <=2) 1
    else fiboTailrec(2, 1 ,1)
  }

  println(fibononacci(8))
}
