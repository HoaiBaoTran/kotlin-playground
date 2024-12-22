package collections

fun calculate(x: Int, y: Int, op: (x: Int, y: Int) -> Int)  : Int {
    return op(x, y)
}

fun main() {

    val addLambda = {x: Int ->  x * x}
    val addResult = addLambda(3)
    println("addResult: $addResult")

    val multiplyLambda = { x: Int, y: Int ->
        println("X is $x and y is $y")
        x * y
    }
    val multiplyResult = multiplyLambda(3, 4)
    println("multiplyResult: $multiplyResult")

    val result = calculate(2, 3) { a, b -> a * b }
    println("Result is $result")

    val add = calculate(2, 3) { a, b -> a + b }
    println("Result is $add")
}