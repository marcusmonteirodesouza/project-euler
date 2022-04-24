object Problem_1 {
  def solution(): Int = sumMultiplesOf3Or5Below(1000)

  private def sumMultiplesOf3Or5Below(n: Int): Int = {
    (1 until n).filter(x => x % 3 == 0 || x % 5 == 0).sum
  }
}
