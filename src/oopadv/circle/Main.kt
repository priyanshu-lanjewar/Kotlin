package oopadv.circle

import java.util.*

fun main(args : Array<String>)
{
    val inp=Scanner(System.`in`)
    val p1=CircleType()
    val p2=CircleType()
    print("Enter Center Of Circle : \nx-coordinate => ")
    var x=inp.nextDouble()
    print("y-coordinate => ")
    var y=inp.nextDouble()
    p1.setPoint(x = x,y = y)
    print("Enter a point on circle Circle : \nx-coordinate => ")
    x=inp.nextDouble()
    print("y-coordinate => ")
    y=inp.nextDouble()
    p2.setPoint(x = x,y = y)
    p1.setRadius(p1 = p1,p2 = p2)
    println()
    p1.cirEqn(p1 = p1)
    print("Area is ${p1.getArea()} and perimeter is ${p1.getPerimeter()}")

}