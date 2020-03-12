package oopadv.school

class Student(name:String,age:Int,course:String,roll:Int,marks:Double) : Person (name, age)
{
    var course:String
    var marks:Double
    var roll:Int

    init {
        this.course=course
        this.marks=marks
        this.roll=roll
    }

    fun dispaly()
    {
        print("Name : $name \nAge : $age \nCourse : $course \nRoll no : $roll \nMarks : $marks")
        println()
    }
}