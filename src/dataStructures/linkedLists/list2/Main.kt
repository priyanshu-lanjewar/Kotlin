package dataStructures.linkedLists.list2

import java.util.*

fun main(args: Array<String>) {

    val input=Scanner(System.`in`)
    var Start:Node? =null
    var temp:Node?= null
    var roll:Int?
    var marks:Double?
    Start=temp
    var IN:Char?
    while(true)
    {
            print("Enter Roll Number : ")
            roll=input.nextInt()
            print("Enter Marks : ")
            marks=input.nextDouble()
            temp?.`roll no`=roll
            temp?.marks=marks
            print("Want To Continue (Y) to continue , any other key to Exit  : ")
            IN=input.next()[0]
            if(IN.toLowerCase()=='y')
            temp?.next=Node()
            else
            {
                temp?.next=null
                break
            }


        temp= temp?.next


    }
    println()
    temp=Start
    while(temp!=null)
    {
        println("\nRoll no : ${temp?.`roll no`}")
        println("Marks   : ${temp?.marks}")
        temp= temp?.next
    }

}