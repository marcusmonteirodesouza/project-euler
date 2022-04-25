import scala.annotation.tailrec

object Problem_5 {
  def solution(): Int = {
    (1 until 20).reduce((a, b) => lcm(a, b))
  }

  def lcm(a: Int, b: Int): Int = {
    math.abs(a * b) / gcd(a, b)
  }

  @tailrec
  def gcd(a: Int, b: Int): Int = {
    b match {
      case 0 => a
      case _ => gcd(b, a % b)
    }
  }
}
