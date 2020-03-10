import java.util.Scanner

fun main(aa: Array<String>)
{
    var sc:Scanner= Scanner(System.`in`)
    print("Enter Radius of Cylinder :")
    var rad:Double=sc.nextDouble()
    print("Enter Height :")
    var hei:Double=sc.nextDouble()
    var vol:Double=Math.PI*rad*rad*hei
    println("Volume Of Cylinder is $vol")
}