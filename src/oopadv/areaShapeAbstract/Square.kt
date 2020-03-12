package oopadv.areaShapeAbstract

class Square(side:Double) : Shape()
{
    var side:Double
    init {
        this.side=side
    }
    override var area: Double = 0.0
    override fun computeAreaa() {
    area = side*side
    }

    override fun returnArea(): Double {
        return area
    }

}