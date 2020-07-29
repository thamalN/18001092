class Rational(x:Int, y:Int) {
  def numer = x
  def denom = y
  def neg = new Rational(-this.numer, this.denom)

  def sub(r:Rational) = new Rational(this.numer*r.denom - this.denom*r.numer, this.denom*r.denom)

  override def toString = numer +  "/" + denom
}

val x = new Rational(3, 4)
val y = new Rational(5, 8)
val z = new Rational(2, 7)


//question 1
println(x.neg)

//question 2
println(x.sub(y).sub(z))

//____________________________________________________________________________//

class Account(id:String, n:Int, b:Double) {
  val nic = id
  val accno = n
  var balance = b

  def transfer(a:Account, b:Double): Unit = {
    a.balance += b
    balance -= b
  }

  override def toString = "["+nic+":"+accno+":"+balance+"]"
}

var a = new Account("100", 906541234, 5000)
var b = new Account("200", 895243214, 7000)
var c = new Account("200", 815234522, -1000)

//question 3
b.transfer(a, 9000)
println(a.balance)
println(b.balance)

//question 4.1
var bank:List[Account] = List(a, b, c)
val negAcc = bank.filter(_.balance < 0)
println(negAcc)

//question 4.2
val sum = bank.map(x => x.balance).reduce((p, q) => p+q)
println(sum)

//question 4.3
val interest = bank.map(x => if(x.balance >= 0) x.balance*1.05 else x.balance*1.1)
println(interest)
