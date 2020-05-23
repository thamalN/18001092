def CtoF(x:Double): Double ={x * 1.8 + 32}
CtoF(35)

def volume(r:Double): Double = {4.0/3 * Math.PI * r * r * r }
volume(5)

def wholesale(y:Int): Double = {y * 24.95 * (1-0.4) + 3 * 50 + (y - 50) * 0.75}
wholesale(60)