package recursion

import java.util.*

fun gcd(n1: Int, n2: Int): Int
{
    return if (n2 != 0) gcd(n2, n1 % n2) else n1
}

fun main()
{
    print("Enter two Number : ")
    print("GCD OF 2 NUMBER IS : ${gcd(Scanner(System.`in`).nextInt(),Scanner(System.`in`).nextInt())}")
}