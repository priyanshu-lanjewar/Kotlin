package recursion

import java.math.BigInteger
import java.util.*


fun factorial(no:BigInteger): BigInteger {
    if(no<=1.toBigInteger())
        return 1.toBigInteger()
    else
        return no* factorial(no-1.toBigInteger())
}

fun main()
{
    print("Enter No to Calculate Its Factorial : ")
    val inp=Scanner(System.`in`)
    val no=inp.nextBigInteger()
    var fact2= factorial(no)
    println("Factorial of $no is $fact2")
}