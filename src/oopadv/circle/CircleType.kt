package oopadv.circle

import kotlin.math.abs

class CircleType() : PointType()
{
    val pi: Double by lazy { Math.PI }
    var radius:Double=0.0

    fun setRadius(p1:PointType,p2:PointType)
    {
        radius=Math.pow(((Math.pow((p1.x-p2.x),2.0))+(Math.pow((p1.y-p2.y),2.0))),0.5)
    }
    fun cirEqn(p1:PointType)
    {
        print("Equation of circle is : (( x")
        if(p1.x>0)
            print(" - ${abs(p1.x)})square) + (( y")
        else if(p1.x<0) print(" + ${abs(p1.x)} )square) + (( y")
        else print(" )square) + (( y")
        if(p1.y>0)
            print(" - ${abs(p1.y)})square) =  ${Math.pow(radius,2.0)}")
        else if(p1.y<0) print(" + ${abs(p1.y)} )square) = ${Math.pow(radius,2.0)}")
        else print(" )square)  = ${Math.pow(radius,2.0)} ")
        println()
    }
    fun getArea():Double
    {
        return pi*radius*radius
    }
    fun getPerimeter():Double
    {
        return pi*2*radius
    }
}