
public class TestMultipleCatchBlock {

	public static void main(String []args) {
	try
	{
		int a[]=new int[5];
		a[7]=10;
		int b=10/0;
	}
	
	catch(ArithmeticException e)
	{
		System.out.println("task1 1 completed");
		}
	
	catch(Exception e)
	{
		System.out.println("common task completed");
		}
	System.out.println("rest of the code...");
	}

}

