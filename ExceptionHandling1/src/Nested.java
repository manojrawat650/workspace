class Parent1
{
	public void method()
	{
		try{
			int b=10/0;
try
	{
		int a=20/0;
		
	}
	catch(Exception e)
	{
		System.out.println("inner");
	}
		}
		catch(ArithmeticException e)
		{
			System.out.println("outer");
		}
   }
}
public class Nested {

	public static void main(String[] args) {
	Parent1 p=new Parent1();
	p.method();

	}

}
