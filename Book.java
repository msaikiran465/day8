class Author
{
String authorName;
int age;
String place;
//author class constructor
Author(String name,int age,String place)
{
this.authorName=name;
this.age=age;
this.place=place;
}
}
class Book
{
String name;
int price;
Author author;//auther details
Book(String n,int p,Author author)
{
this.name=n;
this.price=p;
this.author=author;
}
public static void main(String[] args)
{
Author author=new Author("John",34,"USA");
Book b=new Book("java for begginer",500,author);
System.out.println(" book name:"+b.name);
System.out.println("book price:"+b.price);
System.out.println(" ----------auther Details----------");
System.out.println("Auther Name:"+b.author.authorName);
System.out.println("Auther Age:"+b.author.age);
System.out.println("Auther place:"+b.author.place);}
}