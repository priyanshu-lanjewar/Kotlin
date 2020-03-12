package oopadv.areaShapeAbstract

class Circle(radius : Double) : Shape()
{
    override var area: Double=0.0
    var radius:Double
    init {
        this.radius=radius
    }

    override fun computeAreaa() {
        area=Math.PI*Math.pow(radius,2.0)
    }

    override fun returnArea(): Double {
        return area
    }
}