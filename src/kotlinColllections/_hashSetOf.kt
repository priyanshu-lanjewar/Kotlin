package kotlinColllections

fun main()
{
    var set = hashSetOf<Int>(1,2,2,3,3,3,4,4,4,4,9,9,9,9,9,9,8,8,8,5,5,7,7,6)
    for(element in set)
        println(element)
    println(set)

    set.add(0)
    set.add(10)
    set.add(10)
    for(element in set)
        println(element)
    println(set)
}