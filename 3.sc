import scala.annotation.tailrec

//1)
@tailrec
def GCD(a: Int, b: Int): Int = b match {
  case 0 => a
  case x if x > a => GCD(x, a)
  case x => GCD(x, a%x)
}

@tailrec
def prime(a: Int, b: Int=2): Boolean = b match {
  case x if x == a => true
  case x if GCD(a, x) > 1 => false
  case x => prime(a, x+1)
}

//2)
@tailrec
def primeSeq(n: Int): Unit = {
  if (prime(n)) println(n)
  if (n > 0) primeSeq(n-1)
}

//3)
def sum(n: Int): Int = {
  if(n == 1) 1
  else n + sum(n-1)
}

//4)
@tailrec
def evenOdd(n: Int): Unit = n match {
  case 0 => println("Even")
  case 1 => println("Odd")
  case _ => evenOdd(n-2)
}

//5)
def sumOfEven(n: Int): Int = (n-1)%2 match {
  case 0 if n>2 => n-1 + sumOfEven(n-1)
  case 1 if n>2 => sumOfEven(n-1)
  case _ => 0
}

//6)
def fib(n: Int): Int = n match {
  case 0 => 0
  case 1 => 1
  case _ => fib(n-1) + fib(n-2)
}

def fibSeq(n: Int): Unit = {
  if(n>0) fibSeq(n-1)
  println(fib(n))
}
