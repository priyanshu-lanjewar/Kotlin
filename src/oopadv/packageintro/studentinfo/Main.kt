package oopadv.packageintro.studentinfo

import java.util.*

fun main(args : Array<String>)
{
    val i=Scanner(System.`in`)
    print("Enter Students Details : \nName    : ")
    val name=i.nextLine()
    print("Roll No : ")
    val roll=i.nextInt()
    print("Mark 1  : ")
    val m1=i.nextInt()
    print("Mark 2  : ")
    val m2=i.nextInt()
    print("Score 1 : ")
    val s1 =i.nextInt()
    print("Score 2 : ")
    val s2 =i.nextInt()

    val student=Test()
    student.input(name = name,roll = roll,mark1 = m1,mark2 = m1,score1 = s1,score2 = s2)
    student.output()

}