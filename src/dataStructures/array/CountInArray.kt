package dataStructures.array

import java.util.*

fun main(args : Array<String>)
{
    val input=Scanner(System.`in`)
    print("Enter 10 Elements of Array :\n")
    var A1=Array<Int>(10){0}
    for( i in 0 until 9)
    {
        print("Enter Element No : ${i+1} => ")
        A1[i]=input.nextInt()
        println()
    }
    var count:Int=0
    print("Enter Element to search => ")
    var element:Int=input.nextInt()
    println()
    for( i in 0 until 9)
    {
        if(A1[i]==element)
            count++
    }
    if(count==0) print("Element is no present in an Array ")
    if(count==0) print("Element is no present in an Array ")
    else print("Element is present $count time(s) in an Array ")
}