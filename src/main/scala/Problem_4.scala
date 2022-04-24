

object Problem_4 {
  def solution(): Int = {
    largestPalindromeProductOfThreeDigits()
  }

  private def largestPalindromeProductOfThreeDigits(): Int = {
    var palindromes = Seq[Int]()

    for (i <- 100 to 999) {
      for (j <- 100 to 999) {
        val p = i * j
        if (isPalindrome(p.toString)) {
          palindromes = palindromes :+ p
        }
      }
    }

    palindromes.max
  }

  private def isPalindrome(s: String): Boolean = {
    s == s.reverse
  }
}
