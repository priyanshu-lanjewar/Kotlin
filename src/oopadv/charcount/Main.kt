package oopadv.charcount

import java.util.*
import kotlin.system.exitProcess

fun main(args :Array<String>)
{
    val n=Scanner(System.`in`)
    print("Enter Your Name : ")
    val name:String=n.nextLine()

    val person=Person(name = name)
    person.count_char()
    person.display()
    exitProcess(0)
}