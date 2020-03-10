fun main(args: Array<String>)
{
    var a: Int
    var b: Int
    a=10
    b=20
    println("Before Swapping a=$a b=$b")
    //swapping
    a=a+b
    b=a-b
    a=a-b
    println("After  swapping a=$a b=$b")
}