package recursion

import java.util.*
var step:Int=1
fun process(n: Int, source: String, dest: String, temp: String)
{
    if (n == 1)
    {
        println("Step - ${step} : Move disk 1 from rod $source to rod $dest")
        step++
        return
    }
    process(n=n - 1, source = source, temp = temp, dest = dest)
    println("Step - ${step} : Move disk $n from rod $source to rod $dest")
    step++
    process(n = n - 1, temp = temp, dest = dest, source = source)
}
fun main()
{
    print("Enter no of Disks : ")
    process(n=Scanner(System.`in`).nextInt(),source = "R1",dest = "R3",temp = "R2")
}