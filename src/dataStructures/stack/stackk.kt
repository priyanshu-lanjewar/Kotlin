package dataStructures.stack

class stackk
{
    fun isEmpty():Boolean=(root==null)

    fun push(data:Int)
    {
        var newNode = Node(data)
        if(isEmpty())
        {
            root = newNode
        }
        else
        {
            var temp:Node?= root
            root = newNode
            newNode.next=temp
        }
    }
    fun pop():Int?
    {
        var popp:Int?=null
        if(isEmpty())
            println("Stack is Empty!!")
        else
        {
            popp= root?.Data
            root= root?.next
        }
        return popp
    }
    fun peak():Int? {
        if (root == null) {
            println("Stack is empty")
            return null
        } else {
            return root?.Data
        }
    }
}