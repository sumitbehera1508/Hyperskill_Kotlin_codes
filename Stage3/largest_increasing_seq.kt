fun main() {
    // write your code here
    var length:Int=0
    var m =0
    val n = readln().toInt()
    var prev =0
    repeat(n){
        var temp = readln().toInt()
        if(temp>=prev) {
            length++
            prev = temp
        }
        else{
            prev = temp
            length=1
        }
        if(m<length){
            m=length
        }

    }
    println(m)
}