package dataStructures.linkedLists.studentList

var root:Node? = null

fun main()
{
    val list1 : list=list()
    while(true)
    {
        print("Enter ")
        val no:Int=s.nextInt()
        when(no)
        {
            0 -> System.exit(0)
            1->
            {
                println("Enter Roll no : ")
                var roll = s.nextInt()
                println("Enter marks : ")
                var marks = s.nextDouble()
                list1.push(roll,marks)
            }
            2 -> list1.pop()
        }

    }
}