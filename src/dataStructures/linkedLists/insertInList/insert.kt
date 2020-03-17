package dataStructures.linkedLists.insertInList
fun insert()
{
    print("1 : to enter @ begin\n2 : to enter @ end\nInput Goes Here = > ")
    var k= input.next()[0]
    if(k=='1')
    {
        temp = Node()
        temp?.next= Start
        Start = temp
        print("Enter Employee ID : ")
        id = input.nextInt()
        print("Enter Salary : ")
        salary = input.nextDouble()
        print("Enter Name : ")
        name = input.nextLine()
        name = input.next()
        temp?.name = name
        temp?.`emp id` = id
        temp?.salary = salary

    }
    else if(k=='2') {

        print("Enter Employee ID : ")
        id = input.nextInt()
        print("Enter Salary : ")
        salary = input.nextDouble()
        print("Enter Name : ")
        name = input.nextLine()
        name = input.next()
        temp = tail
        temp?.next = Node()
        temp = temp?.next
        temp?.name = name
        temp?.`emp id` = id
        temp?.salary = salary
        temp?.next=null
        tail= temp
        temp=temp?.next
    }

    else
        println("Invalid Input !!")

}