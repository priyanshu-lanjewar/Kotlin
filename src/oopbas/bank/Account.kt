package oopbas.bank

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Scanner
class Account()
{
    private var id:Int=0
    private var balance:Double=0.0
    private var annualInterestRate:Double=0.0
    private var formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")

    var date = (LocalDate.parse("01-01-1000", formatter))

    fun setId(id:Int){this.id=id}
    fun setBal(balance:Double){this.balance=balance}
    fun setDate(dar:String){this.date=(LocalDate.parse(dar, formatter))}
    fun setInt(annualInterestRate:Double){this.annualInterestRate=annualInterestRate}
    fun getMonthlyInterestRate():Double=annualInterestRate/12
    fun getMonthlyInterest():Double=balance*annualInterestRate/1200
    fun withdraw(amt:Double):Double
    {
        balance=balance-amt
        return balance
    }
    fun deposite(amt:Double):Double
    {
        balance=balance+amt
        return balance
    }
    fun getBalance():Double=balance
}