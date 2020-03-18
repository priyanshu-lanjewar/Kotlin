package exceptionHandelling

import java.lang.NumberFormatException
import java.util.*

fun main(args: Array<String>) {
    val no:Scanner= Scanner(System.`in`)
    println("Enter Your Lucky No : ")
    val `lucky no` = no.nextInt()
    try {


        if (`lucky no` <= 0)
            throw NumberFormatException()
    }
    catch (e:NumberFormatException) {
        println(e)
    }
    println("Lucky No : $`lucky no`")

}