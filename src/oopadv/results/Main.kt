package oopadv.results

import java.util.*

fun main(args : Array<String>)
{
    val inp: Scanner = Scanner(System.`in`)
    print("Enter Number Of Students : ")
    val no:Int=inp.nextInt()

    val stu = Array<Exam>(no) { Exam() }

    for(i in 0..no-1)
    {
        println("Enter details of Student : ${i+1}")
        print("Roll no : ")
        val roll=inp.nextInt()
        print("Name    : ")
        inp.nextLine()
        val name=inp.nextLine()
        print("Branch  : ")
        val branch=inp.nextLine()
        print("Mark 1  : ")
        val m1=inp.nextInt()
        print("Mark 2  : ")
        val m2=inp.nextInt()
        print("Mark 3  : ")
        val m3=inp.nextInt()

        stu[i].input_marks(roll = roll,name = name,branch = branch,mark1 = m1,mark2 = m2,mark3 = m3)
    }

    print("Results \n\n")
    for(i in 0..no)
    {
        stu[i].display_result()
    }
}