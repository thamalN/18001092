case class Point(a: Int, b: Int) {
  def x = a
  def y = b

  def add(c: Point) = Point(c.x + x, c.y + y)

  def move(dx: Int, dy: Int) = Point(x + dx, y + dy)

  def distance(c: Point) = math.sqrt(math.pow(y - c.y, 2) + math.pow(x - c.x, 2))

  def invert() = Point(b, a)
}

val x = Point(1,2)
val y = Point(5,3)

println(x.add(y))
println(x.move(4,6))
println(y.distance(x))
println(x.invert())