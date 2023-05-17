import java.util.Scanner
fun main() {
    // write your code here
    val input = Scanner(System.`in`)
    val min = input.nextInt()
    val max = input.nextInt()
    val curr = input.nextInt()
    println(if(curr>max) "Excess" else if(curr<min) "Deficiency" else "Normal")
}