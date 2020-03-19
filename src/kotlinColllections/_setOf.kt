package kotlinColllections

fun main()
{
    var set = setOf<Int>(1,2,3,4,5,5,5,5,5,5,6)
    for(element in set)
        println(element)
    println(set)
}