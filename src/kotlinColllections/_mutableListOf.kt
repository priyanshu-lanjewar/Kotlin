package kotlinColllections

fun main()
{
    var list = mutableListOf<Int>(2,4,6,8,10)
    for(element in list) println(element)

    list.add(12)
    list.add(14)
    list.add(0,0)
    for(element in list) println(element)
    list.remove(12)
    list.removeAt(0)
    for(element in list) println(element)
}