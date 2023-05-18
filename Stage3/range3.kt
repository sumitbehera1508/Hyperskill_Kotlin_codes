fun main() {
    // write your code here
    val A = readln().toInt()
    val B = readln().toInt()
    val range1 = A..B
    val C = readln().toInt()
    val D = readln().toInt()
    val range2 = C .. D
    val value = readln().toInt()
    println(value in range1 || value in range2)
}