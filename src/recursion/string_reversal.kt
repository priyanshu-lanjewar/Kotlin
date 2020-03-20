package recursion

import java.util.*

fun rev(input:String):String
{
    if(input=="")
        return ""
    else
    {
        var len = input.length
        return input[len-1].toString()+ rev(input.removeSuffix(input[len-1].toString()))
    }
}
fun main()
{
    val inp=Scanner(System.`in`)
    print("Enter String : ")
    var string=inp.nextLine()
    print("Reverse of given string $string is ${rev(string)}")
}