fun main() {
    val time = readln().toInt()
    val workTime = 9..18
    val lunchTime = 13..14
    // do not change the code above
    // put your code here
    println((time in workTime -1) && (time !in lunchTime-1))
}