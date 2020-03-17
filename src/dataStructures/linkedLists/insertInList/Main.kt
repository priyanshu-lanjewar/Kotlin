package dataStructures.linkedLists.insertInList
import java.util.*
val input=Scanner(System.`in`)
var name:String? = null
var id:Int? = null
var salary:Double? = null
var temp:Node?=Node()
var Start=temp
var tail= temp
fun main(args: Array<String>)
{
    while(true)
    {
        print("0 : Exit\n1 : Create Employee List\n2 : Insert Employee \n3 : Display details \n4 : Delete Details \nInput Goes Here => ")
        val n=input.nextInt()
        when(n)
        {
            0 -> System.exit(0)
            1 -> create()
            2 -> insert()
            2 -> insert()
            3 -> display()
            4 -> delete()
        }
    }
}
