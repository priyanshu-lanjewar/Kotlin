package oopadv.commision

class Commision(sales:Int)
{
    var sales:Int = 0
    var per:Double=0.0
    init {
        this.sales=sales
    }
    fun setper(per:Double)
    {
        this.per=per
    }

    fun getCommision():Double=(per/100)*sales
}