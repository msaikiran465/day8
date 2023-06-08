//java code by 'THIS'keyword
class Student
{
int rollno;
String name;
float fee;
Student(int rollno,String name,float fee)
{
this.rollno=rollno;
this.name=name;
this.fee=fee;
}
void display(){System.out.println(rollno+" "+name+" "+fee);
}}
class TestThis
{
public static void main(String args[])
{
Student s1=new Student(465,"kiran",4000f);
Student s2=new Student(494,"sumit",6000f);
s1.display();
s2.display();
}
}

