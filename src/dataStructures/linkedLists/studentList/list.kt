package dataStructures.linkedLists.studentList

import java.util.*
val s = Scanner(System.`in`)
class list
{
    fun isEmpty():Boolean=(root==null)

    fun push(roll:Int?,mark:Double?)
    {
        var temp:Node?=null
        var tail:Node?=null
        var newNode = Node(roll,mark)
        print("Where To Insert : \n\nb for begning\nm for middle\ne for ending\nInput Goes Here : ")

        val c :Char? = s.next()[0]
        when(c)
        {
            'b' ->
            {
                if(isEmpty())
                {
                    root=newNode
                    tail= root
                }
                else
                {
                    temp = root
                    root = newNode
                    newNode?.next = temp

                }
            }
            'e' ->
            {
                if (isEmpty())
                {
                    tail=newNode
                    root=tail
                }
                else
                {
                    tail?.next=newNode
                    tail=tail?.next
                }
            }
        }
    }
    fun pop()
    {
        var temp2= root
        while (temp2!=null)
        {
            println("${temp2.`regd no`}  ${temp2.marks}")
            temp2=temp2.next
        }
    }

}