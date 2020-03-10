package oopbas.stumarks

fun main(args: Array<String>) {
    var s1 = Student()
    var s2 = Student()
    var s3 = Student()

    s1.setData("Ram", 1001, 100.0)
    s2.setData("Shyam", 1002, 99.99)
    s3.setData("unknown", -1, 0.0)
    s1.display()
    s2.display()
    s3.display()
}
