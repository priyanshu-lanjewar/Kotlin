import java.util.Scanner
fun main(args: Array<String>)
{
    var sc=Scanner(System.`in`)
    var no1:Int
    var no2:Int
    print("ENter No 1 : ")
    no1=sc.nextInt()
    print("Enter No 2 : ")
    no2=sc.nextInt()
    println("Enter \n(+) to Add\n(-) to Substract\n(*) to Multiply\n(/) to get Quetiont \n(%) to get Remainder")
    var operation: Char = sc.next()[0]

   val res:Int = when(operation)
    {
        '+'-> add(no1,no2)
        '-'-> sub(no1,no2)
        '*'-> pro(no1,no2)
        '/'-> que(no1,no2)
        '%'-> rem(no1,no2)
        else-> {print("Invalid Input"); 0}
    }
    print(res)
}
fun add(no1:Int,no2:Int):Int= no1+no2
fun sub(no1:Int,no2:Int):Int= no1-no2
fun pro(no1:Int,no2:Int):Int= no1*no2
fun que(no1:Int,no2:Int):Int= no1/no2
fun rem(no1: Int,no2: Int):Int= no1%no2