package oopadv.company

import java.util.*

fun main(args : Array<String>)
{
    val s=Scanner(System.`in`)
    print("Enter Employee First name : ")
    val fname=s.next()
    print("Enter Employee Last Name : ")
    val lname =s.next()
    print("Enter Employee Id : ")
    val id=s.nextInt()
    print("Enter Employee Salary : ")
    val sal=s.nextInt()
    print("Enter Bonus : ")
    val bonus=s.nextDouble()
    val E=Manager(id,fname,lname,sal)
    E.giveBonus(bonus)
    E.displayEmp()

}