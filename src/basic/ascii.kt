import java.util.Scanner
fun main(args: Array<String>)
{
    val s=Scanner(System.`in`)
    val c:Char;
    print("Enter a Character : ")
    c = s.next()[0]
    val ascii:Int = c.toByte().toInt()
    val opt:String=when(ascii)
    {
        in 65..90 -> "UpperCase Alphabet"
        in 97..122 -> "LowerCase Alphabet"
        in 48..57 -> "Numbers"
        else -> "Special Symbol"
    }
    print("Entered Character $c is a $opt")
}