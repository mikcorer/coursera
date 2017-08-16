package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }

    println(balance(":-)".toList))
    println(countChange(4, List(1,2)))
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if (c == 0 || r == c) return 1
      pascal(c-1, r-1) + pascal(c, r-1)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def check(chars: List[Char], b: Int): Boolean = {
        if (chars.isEmpty) return b == 0
        if (b < 0) return false
        if (chars.head == '(') check(chars.tail, b+1)
        else
        if (chars.head == ')') check(chars.tail, b-1)
        else
          check(chars.tail, b)
      }
      return check(chars, 0)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      if (money < 0 || coins.isEmpty) return 0
      if (money == 0) return 1
      return countChange(money - coins.head, coins) + countChange(money, coins.tail)
    }
  }
