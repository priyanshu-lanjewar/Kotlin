package oopadv.commision

import java.util.*

fun main(args : Array<String>)
{
    val inp=Scanner(System.`in`)
    lateinit var com:String
    var C:Commision
    print("Enter Sales : ")
    var sales:Int=inp.nextInt()
    if(sales<0)
    {
        print("Invalid Input")
        System.exit(0)
    }
    else if(sales<500)
    {
        C= Commision(sales)
        C.setper(2.0)
        com=C.getCommision().toString()
    }
    else if(sales<5000)
    {
        C= Commision(sales)
        C.setper(5.0)
        com=C.getCommision().toString()
    }
    else
    {
        C= Commision(sales)
        C.setper(8.0)
        com=C.getCommision().toString()
    }
    print("Commision : $com")
}