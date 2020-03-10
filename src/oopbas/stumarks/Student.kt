package oopbas.stumarks
class Student {
    lateinit var name: String
    var roll: Int = 0
    var marks: Double = 0.0

    fun setData(name: String, roll: Int, marks: Double) {
        this.marks = marks
        this.name = name
        this.roll = roll
    }

    fun display(): Unit {
        print("Name : $name\nRoll No : $roll \nMarks : $marks\n")
    }

}