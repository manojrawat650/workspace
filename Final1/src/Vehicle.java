
public class Vehicle 
{
final void display()
{
System.out.println("display function of vehicle class");	
}
}
class bike extends Vehicle
{
//void display()
//{           /*display method of vehicle cannot be overridden as it is a final method*/
	
//}
public static void main(String []args)
{
	bike b=new bike();
	b.display();
}
}
