package recursion

import java.util.*

fun isPallindrome(input:String):Boolean
{
    var revv= rev(input=input)
    return (input.toLowerCase()==revv.toLowerCase())
}

fun main()
{
    print("Enter A String : ")
    val inp=Scanner(System.`in`)
    var input = inp.nextLine()
    var r : String = if(isPallindrome(input)) " " else " not "

    println("Inputted String is${r}a pallindromic String")

}