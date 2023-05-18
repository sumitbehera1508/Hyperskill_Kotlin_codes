import  java.util.Scanner
fun main() {
    // put your code here
    var a:Int=0
    var b:Int =0
    var c: Int=0
    val input = Scanner(System.`in`)
    val n = input.nextInt()
    repeat(n){
        val temp = input.nextInt()
        if(temp==0) b++
        else if (temp>0) a++
        else c++
    }
    System.out.printf("%d %d %d",b,a,c)
}