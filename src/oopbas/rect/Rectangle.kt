package oopbas.rect

class Rectangle()
{
    var length:Double=1.0
    var breadth:Double=1.0

    constructor(l:Double,b:Double) : this()
    {
        length=l
        breadth=b
    }
    fun getArea():Double=length*breadth;
    fun getPerimeter():Double=2*(length+breadth)
}