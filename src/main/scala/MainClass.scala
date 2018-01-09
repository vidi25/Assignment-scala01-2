object MainClass extends App {

  val obj = new Functionalities
  val element1: Int = 10
  val element2: Int = 5
  val element3: Int = 3
  val element4: Int = 19
  val inputList: List[Int] = List(element1, element2, element3, element4)
  val inputElement1: Int = 6

  obj.stringInterpolationOnList(inputList)

  val maxElement: Int = obj.findMaximumElement(inputList)
  print(s" Maximum element is $maxElement")

  val sum: Int = obj.sumOfProduct(inputElement1)
  print(s" Sum: $sum")

  val result: Int = obj.findNthFibonacciNumber(inputElement1)
  print(s" $result")

}
