package oopadv.company

abstract class Employee(empId:Int,fname:String,lname:String,salary:Int)
{
    var empID:Int
    var fname:String
    var lname:String
    var salary:Int

    init
    {
        this.empID=empId
        this.fname=fname
        this.lname=lname
        this.salary=salary
    }
}