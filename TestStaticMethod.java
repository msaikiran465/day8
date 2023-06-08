//java program tpo illustrate the use of static variable
class Student
{
int rollno;
String name;
static String college="MTIET";
static void change()
{
college="MTIET";
}
Student(int i,String n)
{
rollno=i;
name=n;
}
//METHOD TO DISPLAY VALUE
void display(){
System.out.println(rollno+" "+name+" "+college);
}}
public class TestStaticMethod
{
public static void main(String args[])
{
Student.change();
Student s1=new Student(465,"kiran");
Student s2=new Student(434,"ramesh");
Student s3=new Student(423,"manju");
s1.display();
s2.display();
s3.display();
}
}
