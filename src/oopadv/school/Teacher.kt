package oopadv.school

class Teacher(name:String,age:Int,subject_assigned:String,contact_hour:String):Person(name,age)
{
    var subject_assigned:String
    var contact_hour:String

    init {
        this.contact_hour=contact_hour
        this.subject_assigned=subject_assigned
    }

    fun display()
    {
        print("Name : $name\nAge : $age\nSubject Assigned : $subject_assigned\nContact Hours : $contact_hour")
        println()
    }
}