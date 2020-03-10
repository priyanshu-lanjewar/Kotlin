import java.util.*

fun main(args: Array<String>)
{
    var sc= Scanner(System.`in`)
    print("Enter Temperature in Celcius : ")
    var temp:Double =sc.nextDouble()
    var opt:Double=(9.0/5.0)*temp+32
    println("$temp degrees celcius = $opt degree Farenheit")
}