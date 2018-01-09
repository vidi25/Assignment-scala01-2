object ScalaAssignment2Test extends App {

  val obj = new ScalaAssignment2
  val element1: Int = 10
  val element2: Int = 5
  val element3: Int = 3
  val element4: Int = 19
  val inputList: List[Int] = List(element1,element2,element3,element4)
  val input1: Int = 5

  val result = obj.stringInterpolationOnList(inputList)
  println(result)

  val maxElement: Int = obj.findMaximumElement(inputList)
  println(s"Maximum element is $maxElement")

  val sum: Int = obj.SumOfProductOfNumbers(input1)
  println(s"Sum: $sum")

  val result1: Int = obj.findNthFibonacciNumber(input1)
  println(s"$result1")

}
