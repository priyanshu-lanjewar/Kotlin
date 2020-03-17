package dataStructures.linkedLists.insertInList
fun diaplay() {
    temp = Start

    while (temp != null) {

        println("Employee Id     : ${temp?.`emp id`}")
        println("Employee Name   : ${temp?.name}")
        println("Employee Salary : ${temp?.salary}")
        temp = temp?.next
    }
}
