package basic

object Functions extends App {
 val test: Int = 1

 def greet(name: String, age: Int): Unit = println(s"Hi, my name is $name, my age is $age")
 greet("mudassar", 36)

 def factorial(n: Int): Int = {
   if n <= 0  then 1
   else n * factorial(n-1)
 }
 println(factorial(5))

 def fibonacci(n: Int): Int = {
   if n < 2 then n
   else n + fibonacci(n - 1)
 }

 println(fibonacci(5))
}
