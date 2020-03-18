package exceptionHandelling

import java.util.*

fun main()
{
    val input=Scanner(System.`in`)
    print("Enter marks : ")

            try
            {
                      val marks = input.nextInt()
                      if ((marks < 0) || (marks > 100))
                        throw MarksOutOfBoundException("Marks Cannot Be Greater Than Hundred Or Less Than Zero ")
                      else
                          print("Marks : $marks")
            }
            catch (e : MarksOutOfBoundException)
            {
                println(e)
            }
}