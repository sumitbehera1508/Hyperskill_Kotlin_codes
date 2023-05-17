package cinema
import  java.util.Scanner
fun main() {
    // write your code here
    val input = Scanner(System.`in`)
    println("Enter the number of rows:")
    val a =  input.nextInt()
    println("Enter the number of seats in each row:")
    val b = input.nextInt()
    var c =0
    if(a*b<=60)
        c=a*b*10
    else
        c=(a+1)/2*b*8+a/2*10*b
    println("Total income:\n$$c")
}