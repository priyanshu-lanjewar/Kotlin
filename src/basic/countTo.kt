import java.util.Scanner
import oopbas.stopwatch.*
fun main(args: Array<String>)
{
    val s = Scanner(System.`in`)
    print("Enter a Number : ")
    val no: Int = s.nextInt()
    print("Enter step : ")
    val st:Int=s.nextInt()
    var T=watch(System.currentTimeMillis().toDouble())
    for (i in 0..no step (st))
        print(" $i ")
    T.stop()

    println("\nTime Required : ${T.getElapsedTime()} ms")
}