import java.io.*;

class Parent
{
	public void method()
	{
		try
		{
			throw new IOException();
}
		catch(IOException e)
		{
			System.out.println("parent");
		}
	}
	}
class Child extends Parent
{
	public void method()
	{
		try
		{int b=10/0;}
		catch(Exception e)
		{
			System.out.println("child");
		}
	}
	}
public class MultipleCatchBlock3 {

	public static void main(String[] args) {
		Parent p=new Child();
		p.method();

	}

}
