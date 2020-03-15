package dataStructures.array

import java.util.*

fun main(args :Array<String>)
{
    val input=Scanner(System.`in`)
    print("Size of Array : ")
    val no:Int=input.nextInt()
    var A1 = Array<Double>(no) { 0.0 }
    for(i in 0 until no)
    {
        A1[i]=Math.random()
    }
    var sum:Double=0.0
    for(i in 0 until no)
    {
        sum =+ A1[i]
    }
    val avg:Double=sum/no
    print("ARRAY = { ")
    for(i in 0 until no)
    {
        print(" ${A1[i]} ")
    }
    print(" }\nAverage = $avg")
}