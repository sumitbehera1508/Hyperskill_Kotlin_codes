import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    var cost:Int = 0
    var e:Int =0
    while (scanner.hasNextInt()) {
        val temp = scanner.nextInt()
        if((cost+temp)>balance){
            balance-=cost
            cost =temp
            e++
            break
        }
        cost+=temp

    }
    if(e>0){
        println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $cost.")

    }
    else {
        println("Thank you for choosing us to manage your account! Your balance is ${balance-cost}.")
    }
    // TODO
}