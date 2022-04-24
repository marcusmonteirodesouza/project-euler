object Problem_3 {
  def solution(): Long = {
    largestPrimeFactor(600851475143L)
  }

  def largestPrimeFactor(n: Long): Long = {
    if (n < 2) {
      throw new IllegalArgumentException(
        "Integers less than 2 do not have prime factors")
    }

    var _n = n

    if (_n % 2 == 0) {
      _n /= 2
    }

    if (_n == 1) {
      return 2L
    }

    var i = 1L
    while (_n > 1) {
      i += 2

      if (_n % i == 0) {
        _n /= i
      }
    }

    i
  }
}
