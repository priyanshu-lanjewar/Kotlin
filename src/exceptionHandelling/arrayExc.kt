package exceptionHandelling

import java.lang.NullPointerException

fun main(args: Array<String>) {
    val aa = Array<Int?>(2){null}
    aa[0]=10


    try
    {
        println(aa[0])
        println(aa[2])

    }
    catch (e1 : ArrayIndexOutOfBoundsException)
    {
        println("Error $e1")
    }



    try
    {
        println(aa[1]!!)
    }
    catch (e2 : NullPointerException)
    {
        println("Error $e2")
    }
}