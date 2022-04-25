object Problem_6 {
  def solution(): Long = {
    val sumOfSquares = (1 to 100).map(x => x * x).sum
    val squareOfSum = math.pow((1 to 100).sum, 2).toLong

    math.abs(squareOfSum - sumOfSquares)
  }
}
