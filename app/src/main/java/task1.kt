fun MaxMinOddsEvensAndAverage(a: Int, b: Int, c:Int): Double {
    val max = maxOf(a, b, c)
    val min = minOf(a, b, c)
    val events = listOf(a, b, c).filter { it % 2 == 0 }
    val odds = listOf(a, b, c).filter { it % 2 != 0  }
    val average = (a + b + c) /3.0


    println("Maximum: $max")
    println("Minimum: $min")
    println("Evens: $events")
    println("Odds: $odds")

    return average

}
fun main() {
    val average = MaxMinOddsEvensAndAverage(6, 9, 16)
    println("Average: $average")
}