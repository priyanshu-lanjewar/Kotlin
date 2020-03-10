import java.util.Scanner
fun main(args: Array<String>)
{
    var s=Scanner(System.`in`)
    var h1:Int;
    var h2:Int;
    print("Enter first persons height : ")
    h1=s.nextInt()
    print("Enter Second persons height : ")
    h2=s.nextInt()
    var res:String = if(h1>h2) "First Person Is Taller " else "Second Person Is Taller"
    print(res)
}