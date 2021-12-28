package oop

object Object extends App {

  val writer = new Writer("Mudassar", "Fayyaz", 1985)
  val novel = new Novel("Ibrahim", 1998, writer)
  println(writer.fullname)
  println(novel.authorAge)
  println(novel.isWrittenBy(writer))
  println(novel.copy(1999))

  val counter = new Counter
  counter.inc.inc.inc.inc.dec.inc(5).print

  class Writer(firstName: String, surname: String, val year: Int) {
    def fullname: String = s"Writer full name is ${this.firstName} ${this.surname}"
  }

  class Novel(name: String, year: Int, author: Writer) {
    def authorAge: Int = year - author.year

    def isWrittenBy(author: Writer) = author == this.author

    def copy(newYear: Int) = new Novel(name, newYear, author)
  }

  class Counter(val no: Int = 0) {
    def current = no

    def inc = {
      println("incrementing")
      new Counter(no + 1)
    }

    def dec = {
      println("decrementing")
      new Counter(no - 1)
    }

    def inc(n: Int): Counter = {
      if (n <= 0) this
      else inc.inc(n - 1)
    }

    def dec(n: Int): Counter = {
      if (n <= 0) this
      else inc.dec(n - 1)
    }

    def print = println(this.no)

  }
}
