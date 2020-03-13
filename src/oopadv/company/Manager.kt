package oopadv.company

import java.lang.Exception


class Manager(empId:Int,fname:String,lname:String,salary:Int):Employee(empId, fname, lname, salary),EmpInterface {
    var Bonus: Double? =null

    override fun displayEmp()
    {
        println("Name : $fname $lname\nEmployee ID : $empID\nSalary : $salary\nBonus : $Bonus")
    }

    override fun giveBonus(amount: Double) {
        if(amount<=0) throw InvalidBonusException("Bonus Cannot Be Less than Or Equals to 0")
        else Bonus=amount
    }
}
