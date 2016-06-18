
public class ABC extends XYZ {

ABC()
{
System.out.println("Constructor is running");	
}
{
	System.out.println("instance initializer block is running");
}
static
{
System.out.println("Static block is running");	
}
	public static void main(String[] args)
	{
	new ABC();
	}

}
