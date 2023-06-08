class Animal
{
void eat(){System.out.println("eating....");
}
}
class Dog extends Animal
{
void bark(){System.out.println("barking...");
}
}
class TestSingleInheritance
{
public static void main(String args[])3
{
Dog d=new Dog();
d.bark();
d.eat();
}
} 
