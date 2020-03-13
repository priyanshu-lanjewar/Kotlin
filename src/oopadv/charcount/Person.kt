package oopadv.charcount

class Person (name:String): count
{
    private var name:String
    init {
        this.name=name
    }
    var maxcount:Int=0

    override fun display()
    {
        println("Name is $name")
        println("No Of Character Excluding Space is $maxcount")
    }

    override fun count_char()
    {
        var s2:String=name.replace(" ","",true)
        maxcount=s2.length
    }

}