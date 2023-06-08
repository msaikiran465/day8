




String name;
Address address;
public Emp(int id,String name,Address address)
{
this.id=id;
this.name=name;
this.address=address;
}
void display(){
System.out.println(id+" "+name);
System.out.println(address.city+" "+address.state+" "+address.country);
}
public static void main(String args[]){
Address address1=new Address("palamner","AP","india");
Address address2=new Address("chitoor","AP","india");
Emp e1=new Emp(465,"kiran",address1);
Emp e2=new Emp(494,"charan",address2);
e1.display();
e2.display();
}
}
