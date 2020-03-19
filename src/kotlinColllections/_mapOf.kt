package kotlinColllections

fun main()
{
    var Map = mapOf<Char,String>('a' to "apple", 'b' to "ball",'c' to "cat")
    for(maps in Map)
        println(maps)
    for(key in Map.keys)
        println(Map[key])
    for(key in Map.keys)
        println(key)
    for(value in Map.values)
        println(value)
}