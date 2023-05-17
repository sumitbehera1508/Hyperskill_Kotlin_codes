import java.util.Scanner
fun main() {
    // write your code here
    val input = Scanner(System.`in`)
    val a = if(input.nextInt()%2==0) "EVEN" else "ODD"
    println(a)
}