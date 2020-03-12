package oopadv.results

open class Student() {
    var roll: Int = 0
    lateinit var name: String
    lateinit var branch: String

    fun input_Student(roll: Int, branch: String, name: String) {
        this.roll = roll
        this.branch = branch
        this.name = name
    }

    fun display_Student() {
        println("Roll No : $roll\nName : $name \nBranch : $branch")
    }

}