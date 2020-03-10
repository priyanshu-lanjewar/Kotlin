import java.util.Scanner
fun main(args: Array<String>)
{
    val s=Scanner(System.`in`)
    val number:Int;
    print("Enter a number : ")
    number=s.nextInt()
    val res:String = if(number%2==0) "EVEN" else "ODD"
    print(res)
}