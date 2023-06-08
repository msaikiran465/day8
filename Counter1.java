//java program tpo illustrate the use of static variable
class Counter1
{
static int count=0;
Counter1()
{
count++;//increasing the value of static variable
System.out.println(count);
}
public static void main(String args[])
{
//creating objects
Counter1 c1=new Counter1();
Counter1 c2=new Counter1();
Counter1 c3=new Counter1();
}
}

