package oopadv.results

class Exam() : Student() {
    var mark1: Int = 0
    var mark2: Int = 0
    var mark3: Int = 0

    fun input_marks(roll: Int, name: String, branch: String, mark1: Int, mark2: Int, mark3: Int) {
        input_Student(roll = roll, branch = branch, name = name)
        this.mark1 = mark1
        this.mark2 = mark2
        this.mark3 = mark3
    }

    fun display_result() {
        display_Student()
        println("Mark1 : $mark1 \nMark2 : $mark2 \nMark3 : $mark3")
    }
}