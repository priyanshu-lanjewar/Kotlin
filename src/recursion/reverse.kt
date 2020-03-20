package recursion

import java.math.BigInteger
import java.util.*

fun main()
{
    val inp=Scanner(System.`in`)
    print("Enter a number : ")
    var number = inp.nextBigInteger()
    println("Reverse of number $number is ${reve(number)}")
}

fun reve(no:BigInteger):String
{
    if(no<10.toBigInteger())
        return no.toString()
    else
    {
        var r = no % 10.toBigInteger()
        return r.toString()+reve(no/10.toBigInteger())
    }
}
