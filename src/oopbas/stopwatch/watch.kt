package oopbas.stopwatch

class watch(currentTime:Double)
{
    var startTime:Double=0.0
    var stopTime:Double=0.0
    init {
        startTime=currentTime
    }

    fun start()
    {
        startTime= System.currentTimeMillis().toDouble()
    }
    fun stop()
    {
        stopTime=System.currentTimeMillis().toDouble()
    }
    fun getElapsedTime():Double
    {
        return stopTime-startTime
    }
}