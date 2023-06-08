final class bike2{}//final method is overridden
class Honda extends bike2
{
void run(){System.out.println("running safaty with 100kmph");}
public static void main(String args[])
{
Honda obh=new Honda();
obh.run();
}
}