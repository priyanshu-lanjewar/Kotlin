import java.util.Scanner
fun main(args: Array<String>)
{
    val s = Scanner(System.`in`)
    print("Enter a Number of Terms: ")
    val no: Int = s.nextInt()
    var t1:Int=0
    var t2:Int=1
    var tn:Int
    print("  $t1  $t2 ")
    for (i in 3..no)
    {
        tn=t1+t2
        t1=t2
        t2=tn
        print(" $tn ")
    }
}