package oopbas.quadratic
class QuadraticEquation(a:Double,b:Double,c:Double)
{
     var a: Double = 0.0
     var b: Double = 0.0
     var c: Double = 0.0
     init {
            this.a=a
            this.b=b
            this.c=c
          }

    fun getDiscriminant():Double=(Math.pow(b, 2.0)-4*a*c)
    fun getRoot1(D:Double):Double=(-b+Math.sqrt(D))/(2*a)
    fun getRoot2(D:Double):Double=(-b-Math.sqrt(D))/(2*a)
}