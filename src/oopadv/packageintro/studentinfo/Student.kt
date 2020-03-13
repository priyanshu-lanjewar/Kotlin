package oopadv.packageintro.studentinfo
import oopadv.packageintro.sportdetails.Sports
open class Student
{
    lateinit var name:String
    var roll:Int=0

    fun input(name:String,roll:Int)
    {
        this.name=name
        this.roll=roll
    }

    open fun output()
    {
        println("Name        : $name \nRoll Number : $roll")
    }
}