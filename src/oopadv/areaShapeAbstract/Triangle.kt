package oopadv.areaShapeAbstract

class Triangle(s1:Double,s2:Double,s3:Double) : Shape()
{
    override var area:Double=0.0
    var s1:Double
    var s2:Double
    var s3:Double
    init {
        this.s1=s1
        this.s2=s2
        this.s3=s3
    }
    var s:Double=(s1+s2+s3)/2
    override fun computeAreaa() {
        area=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3))
    }

    override fun returnArea(): Double {
        return area
    }

}