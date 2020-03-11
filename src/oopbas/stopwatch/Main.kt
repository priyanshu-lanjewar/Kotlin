package oopbas.stopwatch

import java.util.*

fun main(args:Array<String>)
{
    val i=Scanner(System.`in`)
    var T=watch(System.currentTimeMillis().toDouble())
    while(true)
    {
        print("\nEnter : \n  1 to start \n  2 to stop \n  3 to get Elapsed Time \n  4 to exit \n  Input Goes Here - >  ")
        var inp:Int=i.nextInt()
        when(inp)
        {
            1->T.start()
            2->T.stop()
            3->print("Elapsed Time ${T.getElapsedTime()} milliseconds")
            4->System.exit(0)
            else-> print("Invalid Input \n")
        }
    }
}