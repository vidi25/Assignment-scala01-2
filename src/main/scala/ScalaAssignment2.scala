class ScalaAssignment2 {

  def stringInterpolationOnList(inputList: List[Int]) = {
    val result = for(list <- inputList) yield (s"${inputList.indexOf(list)} = $list")
    result
  }

   def findMaximumElement(inputList: List[Int]): Int = {
       if(inputList.isEmpty) {
         -1
       }
     else
         {
           if(inputList.head >= findMaximumElement(inputList.tail))
             {
               inputList.head
             }
           else
             {
               findMaximumElement(inputList.tail)
             }
         }

   }

  def findNthFibonacciNumberRecursive(n: Int,prevNumber: Int = 0,nextNumber: Int = 1): Int = n match {
    case 0 => prevNumber
    case 1 => nextNumber
    case _ => findNthFibonacciNumberRecursive(n - 1, nextNumber, (nextNumber + prevNumber))
  }

  def findNthFibonacciNumber(number: Int): Int = {
    findNthFibonacciNumberRecursive(number)
  }

  def findProduct(n: Int): Int = {
    if(n <= 1){
      1
    }
    else
      {
        n * findProduct(n - 1)
      }
  }

  def SumOfProductRecursive(number: Int): Int = {
    val rem: Int = number % 10
    if (number == 0) {
      0
    }
    else
      {
        rem + SumOfProductRecursive(number/10)
      }
  }
  def SumOfProduct(n: Int): Int = {
    val product = findProduct(n)
    if(product > 1 && product < 9) {
      product
    }
    else{
      product % 10 + SumOfProductRecursive(product)
    }

  }

}
