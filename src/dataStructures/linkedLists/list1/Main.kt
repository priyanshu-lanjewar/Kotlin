package dataStructures.linkedLists.list1

fun main(args: Array<String>)

 {

        val node1 = Node(value = "123")
        val node2 = Node(value = "abc")
        val node3 = Node(value = "3.0")
        node1.next = node2
        node2.next = node3
        println(node1)

}