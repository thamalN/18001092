//1)
def wage(hrs: Int): Int = hrs * 150
def OT(hrs: Int): Int = hrs * 75
def income(h1: Int, h2: Int): Double = wage(h1) + OT(h2)
def tax(income: Double): Double = income * 0.1
def takeHome(h1: Int, h2: Int): Double = income(h1,h2) - tax(income(h1,h2))

//2)
def attendees(price: Int): Int = 120 + (15 - price) / 5 * 20
def revenue(price: Int): Int = price * attendees(price)
def cost(price: Int): Int = 500 + 3 * attendees(price)
def profit(price: Int): Int = revenue(price) - cost(price)