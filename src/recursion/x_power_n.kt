package recursion

import java.math.BigInteger
import java.util.*

fun calculate(x:BigInteger,n:BigInteger):BigInteger
{
    return when (n)
    {
        0.toBigInteger() -> 1.toBigInteger()
        1.toBigInteger() -> x
        else -> x*calculate(x,n-1.toBigInteger())
    }
}

fun main()
{
    val inp=Scanner(System.`in`)
    print("Enter Value of X : ")
    val x=inp.nextBigInteger()
    print("Enter value of n : ")
    val n=inp.nextBigInteger()
    println("Value of $x power $n is ${calculate(x,n)}")
}