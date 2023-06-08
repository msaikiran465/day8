//java program to demostrate the use of static variable
class Student
{
int rollno;//instance variable
String name;
static String college="MTIET";//static variable
//constructor
Student(int i,String n)
{
rollno=i;
name=n;
}
//method to display value
void display(){System.out.println(rollno+" "+name+" "+college);
}}
class TeststaticVariable1
{
public static void main(String  args[])
{
Student s=new Student(465,"kiran");
Student r=new Student(494,"charan");
s.display();
r.display();
}
}
