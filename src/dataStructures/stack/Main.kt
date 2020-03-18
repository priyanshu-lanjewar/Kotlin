package dataStructures.stack

import java.util.*

var root:Node?=null
fun main()
{
    val stack:stackk= stackk()
    val input=Scanner(System.`in`)
    while (true)
    {
        print("Enter :\n      0 -> To Exit\n      1 -> Push Integer in Stack\n      2 -> Show Peak Integer\n      3 -> Pop out Integer\n\n*Input Goes Here -> ")
        val n=input.nextInt()
        when(n)
        {
            0 -> System.exit(0)
            1 ->
            {
                print("Enter an Integer Value : ")
                val da=input.nextInt()
                stack.push(data = da)
            }
            2 -> println(stack.peak())
            3 -> println(stack.pop())
        }
    }
}