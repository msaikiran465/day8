class bike3//final method is inherited
{
final void run(){System.out.println("running...");}
}
class Honda1 extends bike3
{
public static void main(String args[])
{
new Honda1().run();
}
}