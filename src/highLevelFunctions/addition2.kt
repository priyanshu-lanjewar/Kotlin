package highLevelFunctions


import java.util.*

fun main()
{
    val input=Scanner(System.`in`)
    print("Enter No 1 : ")
    val no1 =input.nextInt()
    print("Enter No 2 : ")
    val no2 =input.nextInt()
    addition(no1,no2) { s-> println(s) }
}

fun addition(no1:Int,no2:Int,todo : (Int)->Unit)
{

    val sum=no1+no2
    todo(sum)
}