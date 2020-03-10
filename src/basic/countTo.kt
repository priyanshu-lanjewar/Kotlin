import java.util.Scanner
fun main(args: Array<String>)
{
    val s = Scanner(System.`in`)
    print("Enter a Number : ")
    val no: Int = s.nextInt()

    for (i in 0..no)
        print(" $i ")
}