package oopbas.rect

import java.util.Scanner
fun main(args:Array<String>)
{
    val S:Scanner=Scanner(System.`in`)
    print("Enter Length of Rectangle : ")
    val l:Double=S.nextDouble()
    print("Enter Bredth Of Rectangle : ")
    val b:Double=S.nextDouble()
    val R1=Rectangle()
    print("For Default Rectangle :\nArea : ${R1.getArea()}\nPerimeter : ${R1.getPerimeter()}\n")
    val R2=Rectangle(l, b)
    print("For Initialized Rectangle :\nArea : ${R2.getArea()}\nPerimeter : ${R2.getPerimeter()}")
}