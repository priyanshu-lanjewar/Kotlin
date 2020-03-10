package oopbas.quadratic
import java.util.Scanner

fun main(args:Array<String>)
{
    val sc=Scanner(System.`in`)
    print("Enter Values Of a, b, c :")
    var a : Double= sc.nextDouble()
    var b : Double= sc.nextDouble()
    var c : Double= sc.nextDouble()
    val obj:QuadraticEquation= QuadraticEquation(a,b,c)
    var discri=obj.getDiscriminant()

    if(discri<0) print("No Root Exists")
    else if(discri>0)
    {
        var x1:Double=obj.getRoot1(discri)
        var x2:Double=obj.getRoot2(discri)
        print("Roots are $x1 and $x2")
    }
    else
        print("ROot is ${(-1*b)/(2*a)}")
}
