package overloadingexample;

public class ABC 
{
public void fun(int a)
{
System.out.println("method of super");	
}
}
class XYZ extends ABC
{
	public void fun(float a)
	{
	System.out.println("method of child"+a);	
	}
	public static void main(String args[])
	{
	XYZ a=new XYZ();
	a.fun(10);
	}
}
