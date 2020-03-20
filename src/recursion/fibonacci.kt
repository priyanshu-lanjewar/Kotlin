package recursion

import java.math.BigInteger
import java.util.*

fun main()
{
    val inp=Scanner(System.`in`)
    print("Enter n to find nth Fibonacci number : ")
    val n=inp.nextBigInteger()
    print("Fibonacci number at position $n is ${nth_fibonacci(n)}")

}

fun nth_fibonacci(n:BigInteger):BigInteger
{
    return when(n)
    {
        1.toBigInteger()->0.toBigInteger()
        2.toBigInteger()->1.toBigInteger()
        else -> nth_fibonacci(n-1.toBigInteger())+ nth_fibonacci(n-2.toBigInteger())
    }
}