class Functionalities {

  def stringInterpolationOnList(inputList: List[Int]): Unit = {
    val result = for(list <- inputList) yield (s"${inputList.indexOf(list)} = $list")
    print(result)
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



  def findNthFibonacciNumber(number: Int): Int = {
    def findNthFibonacciNumberRecursive(number: Int,prevNumber: Int = 0,nextNumber: Int = 1): Int = number match {
      case 0 => prevNumber
      case 1 => nextNumber
      case _ => findNthFibonacciNumberRecursive(number - 1, nextNumber, (nextNumber + prevNumber))
    }
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

  def sumOfProductRecursive(number: Int): Int = {
    val rem: Int = number % 10
    if (number == 0) {
      0
    }
    else
      {
        rem + sumOfProductRecursive(number/10)
      }
  }
  def sumOfProduct(n: Int): Int = {
    val product = findProduct(n)
    if(product > 1 && product < 9)
      {
      product
    }
    else{
      product % 10 + sumOfProductRecursive(product)
    }

  }

}
