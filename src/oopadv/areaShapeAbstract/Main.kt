package oopadv.areaShapeAbstract

import java.util.*

fun main(args : Array<String>)
{
    val s=Scanner(System.`in`)
    print("Enter Length of Square : ")
    val len=s.nextDouble()
    val square:Shape=Square(len)
    square.computeAreaa()
    println("Area of Square is ${square.returnArea()}")
    print("Enter Sides Of Triangle \nSide 1 : ")
    val s1=s.nextDouble()
    print("Side 2 : ")
    val s2=s.nextDouble()
    print("Side 3 : ")
    val s3=s.nextDouble()
    val triangle:Shape=Triangle(s1,s2,s3)
    triangle.computeAreaa()
    println("Area of triangle is ${triangle.returnArea()}")
    print("Enter Radius of Circle : ")
    val radius=s.nextDouble()
    val circle:Shape=Circle(radius)
    circle.computeAreaa()
    println("Area Of Circle is ${circle.returnArea()}")


}