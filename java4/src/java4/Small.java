package java4;

class Big
{
	Big()
	{
		System.out.println("constructor of big");
	}
}
public class Small extends Big{
int a;
	static
{
System.out.println("static block");	
}
Small(int a)
{
System.out.println("constructor of small");	
}
	public static void main(String[] args) 
	{
		Small sm=new Small(10);
	}

}
