
public class TryCatch1
{

	public static void main(String[] args)
	{
	try{
		int a=10/0;
		System.out.println("Rest of the code inside try block ");
		System.out.println("manoj");
	}
	catch(ArithmeticException e)
	{
		System.out.println("caught "+e );
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Exception is :"+e);
	}
	
	
	System.out.println("rest of the code after catch block");

	}

}
