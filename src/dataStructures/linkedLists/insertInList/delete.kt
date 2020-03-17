package dataStructures.linkedLists.insertInList
fun delete()
{
    var check:Int=0
    print("Enter Employee Id To Delete : ")
    id = input.nextInt()
    temp= Start
    var pre= temp
    if(temp?.`emp id`==id)
    {
        temp=temp?.next
        Start= temp
        println("Employee details with employee id : $id is deleted. !!")
        check++
    }
    while(temp?.next!=null)
    {
        if(id==temp?.`emp id`)
        {
            pre?.next=temp?.next
            check++
            println("Employee details with employee id : $id is deleted. !!")
            break
        }
        pre= temp
        temp= temp?.next
    }
    if((temp?.next==null)&&(id== temp?.`emp id`))
    {
        pre?.next=null
        check++
        println("Employee details with employee id : $id is deleted. !!")
    }
    if(check==0)
        println("Employee details with Employee ID : $id not Found !!!")
}