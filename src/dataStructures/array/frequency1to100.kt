package dataStructures.array

import java.util.*

fun main(args : Array<String>)
{
    val input=Scanner(System.`in`)
    print("Enter values of array between 1 to 100 , if input is not between 1 to 100 the program will proceed further...\nInput Begins Here => ")
    val A1= Array<Int>(101){0}
    var i : Int =1
    A1[1]=-1
    while(i in 1 until 100)
    {

        A1[i]++
        i=input.nextInt()
    }
    for(j in 1 until 100)
    {
        if(A1[j]==0)continue
        else if(A1[j]==1) println("$j occurs 1 time.")
                else println("$j occurs ${A1[j]} times.")

    }
}