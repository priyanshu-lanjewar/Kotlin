package oopadv.complexadd

import java.util.*

fun main(args :Array<String>)
{
    val inp:Scanner= Scanner(System.`in`)
    var n1:Complex= Complex()
    var n2:Complex= Complex()
    var temp_real:Double =0.0
    var temp_imag:Double =0.0
    print("Enter No 1 : \n      Real : ")
    temp_real=inp.nextDouble()
    print("      Imag : ")
    temp_imag=inp.nextDouble()
    n1.setData(imag = temp_imag, real = temp_real)
    print("Enter No 2 : \n      Real : ")
    temp_real=inp.nextDouble()
    print("      Imag : ")
    temp_imag=inp.nextDouble()
    n2.setData(imag = temp_imag, real = temp_real)

    var Sum : Complex = n1.add(n1,n2)

    print("Sum = ")
    Sum.display()


}