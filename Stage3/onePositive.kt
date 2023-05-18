import java.util.Scanner
fun main() {
    // put your code here
    val input = Scanner(System.`in`)
    var c =0
    while(input.hasNextInt()){
        if (input.nextInt()>0) c++

    }
    if(c!=1)
        println("false")
    else
        println("true")
}