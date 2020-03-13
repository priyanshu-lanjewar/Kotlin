package oopadv.packageintro.studentinfo
import oopadv.packageintro.sportdetails.Sports
class Test : Student(),Sports
{
    var mark1:Int=0
    var mark2:Int=0
    override var score1: Int=0
    override var score2: Int=0

    fun input(name:String,roll:Int,mark1:Int,mark2:Int,score1:Int,score2:Int)
    {
        super.input(name,roll)
        this.mark1=mark1
        this.mark2=mark2
        this.score1=score1
        this.score2=score2
    }

    override fun output()
    {
        super.output()
        println("Mark 1      : $mark1 \nMark 2      : $mark2 \nScore 1     : $score1 \nScore 2     : $score2")
    }
}