
fun main(args: Array<String>)
{
    var i:Int =1
    while(i<=10)
    {
        var str:String=if(i==1)"st " else if(i==2)"nd " else if(i==3) "rd " else if(i==10) "th" else "th "
        println("$i$str Hello")
        i++
    }
}