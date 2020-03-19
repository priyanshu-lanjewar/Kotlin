package kotlinColllections

fun main()
{
    var Map = mutableMapOf<Int,Int>(0 to 0, 1 to 1, 2 to 4, 3 to 9, 4 to 16 , 5 to 25)
    for(maps in Map)
        println(maps)
    for(key in Map.keys)
        println(Map[key])
    for(key in Map.keys)
        println(key)
    for(value in Map.values)
        println(value)
    Map.put(6,36)
    Map.put(7,59)
    Map.replace(7,49)
    for(maps in Map)
        println(maps)

}