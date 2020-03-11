package oopadv.complexadd

class Complex()
{
    var imag:Double=0.0
    var real:Double=0.0

    fun setData(imag:Double,real:Double)
    {
        this.imag=imag
        this.real=real
    }

    fun display()
    {
        print("$real + $imag i")
    }
    fun add(n1:Complex,n2:Complex):Complex
    {
        var n : Complex= Complex()
        n.real = n1.real+n2.real
        n.imag = n1.imag+n2.imag
        return n
    }
}