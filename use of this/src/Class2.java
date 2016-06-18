
class Super
{
Super()
{
System.out.println("Super class constructor");	
}
public void run()
{}
}
public class Class2 extends Super
{
Class2()
{
	System.out.println("the default constructor");
	this.display();
	}
Class2(int i)
{
	super();
	this();
	
	
System.out.println("parameterized constructor"+i);

}
public void display()
{
	System.out.println("Display method of current class");
}

	public static void main(String[] args)
	{
	Class2 ob=new Class2(10);
	ob.display();
	}

}
