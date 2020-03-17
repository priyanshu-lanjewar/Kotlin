package dataStructures.linkedLists.insertInList
fun create() {
    temp=Node()
    Start=temp
    while (true) {

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
        print("Want to enter another employee details (y/n) : ")
        var ch = input.next()[0]
        if (ch == 'y') {
            temp?.next = Node()
            temp = temp?.next
        } else {
            temp?.next = null
            tail= temp
            temp = temp?.next

            break
        }


    }
}