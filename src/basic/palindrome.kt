import java.util.Scanner

fun main(args: Array<String>)
{
    val input:Scanner= Scanner(System.`in`)
    print("Enter A Number To Check Is The Number Is Pallindrome Or Not : ")
    var no:Int = input.nextInt()
    print("No Is Pallindrome ${pallindrome(no,rev(no))}")

}

fun rev (no :Int):Int{
    var noo:Int=no
    var rem:Int
    var reve: String=""
    while(noo!=0)
    {
        rem = noo % 10;
         noo = noo /10;
        reve=reve+rem
    }
    return reve.toInt()
}
fun pallindrome(no1:Int,no2:Int):Boolean = (no1==no2)
