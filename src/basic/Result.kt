import java.util.Scanner
fun main(args: Array<String>)
{
    val s=Scanner(System.`in`)
    var marks:Int;

    print("Enter Marks : ")
    marks=s.nextInt()

    val res:String = if(marks>40) "Congratulations!You have Passed the exam" else "Sorry You failed The Exam"
    print(res)
}