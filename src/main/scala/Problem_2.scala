import scala.annotation.tailrec

object Problem_2 {
  def solution(): Int = {
    var result = 0
    var term = 1
    var fib = 0
    while (fib < 4000000) {
      fib = fibonacci(term)
      if (fib % 2 == 0) {
        result += fib
      }
      term += 1
    }
    result
  }

  private def fibonacci(term: Int): Int = {
    @tailrec
    def fibonacciGo(a: Int, b: Int, term: Int): Int = {
      if (term == 0) {
        return b
      }
      fibonacciGo(b, a + b, term - 1)
    }
    fibonacciGo(0, 1, term)
  }
}
