package recursion

import java.util.*

fun isPalindrome(input:String):Boolean
{
    var revv= rev(input=input)
    return (input.toLowerCase()==revv.toLowerCase())
}

fun main()
{
    print("Enter A String : ")
    val inp=Scanner(System.`in`)
    var r : String = if(isPalindrome(inp.nextLine())) " " else " not "
    println("Inputted String is${r}a palindromic String")

}