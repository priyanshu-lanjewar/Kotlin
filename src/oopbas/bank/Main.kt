package oopbas.bank

import java.util.*

fun main(args: Array<String>)
{
    val s=Scanner(System.`in`)
    print("Enter Date dd-mm-yyyy format : ")
    var d:String=s.next()
    print("Enter ID : ")
    var id:Int=s.nextInt()
    var cont:Int=1
    var A1=Account()
    print("Enter Annual intrest in % :")
    print("Anual Intrest Rate Recorded Succesfully ${A1.setInt(s.nextDouble())}")
    while(true)
    {
        print("\nEnter: \n 0 to exit \n 1 to Deposite \n 2 to withdraw \n 3 to check balance \n 4 to know monthly intrest rate \n 5 to know monthly intrest \n 6 to know Account Opening Date \n Input Goes Here -> ")
        var c:Int=s.nextInt()
        when(c)
        {
            0-> System.exit(0)
            1-> {
                    print("Enter Amount to Deposite : Rs.")
                    var amt:Double=s.nextDouble()
                    A1.deposite(amt)
                    print("Deposite Succesful \n Balance = Rs.${A1.getBalance()}")
                }
            2-> {
                    print("Enter Amount to Withdraw : Rs.")
                    var amt:Double=s.nextDouble()
                    if(amt>A1.getBalance())
                        print("Insufficient Fund")
                    else {
                        A1.withdraw(amt)
                        print("Withdraw SuccessFul \n Balance = Rs.${A1.getBalance()}")
                    }
                }
            3-> print("Balance : Rs.${A1.getBalance()}")
            4-> {
                print("Your Monthly Intrest rate Is : ${A1.getMonthlyInterestRate()} %")
                }
            5-> {
                print("Monthly Intrest is Rs.${A1.getMonthlyInterest()}")
                }
            6-> {
                A1.setDate(d)
                print("YYYY-MM-DD : ${A1.date}")
                }
            else-> print("Invalid Input Try Again !!!!")

        }
    }

}