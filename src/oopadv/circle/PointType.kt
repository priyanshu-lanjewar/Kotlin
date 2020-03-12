package oopadv.circle

open class PointType
{
    var x:Double=0.0
    var y:Double=0.0

    fun setPoint(x:Double,y:Double)
    {
        this.x=x
        this.y=y
    }

    fun point():PointType
    {
        var p:PointType=PointType()
        p.x=x
        p.y=y
        return p
    }
}