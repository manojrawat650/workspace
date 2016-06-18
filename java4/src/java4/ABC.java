package java4;
class PQR
{
	
}
class XYZ extends ABC
{ 
	public void fun()
	{
		System.out.println("function  of child class XYZ ");
	}
	private void fun1()
	{
		System.out.println("function 1 of child class XYZ ");
	}
	}
public class ABC extends PQR{
	public void fun()
	{
		System.out.println("function of parent class ABC");
	}
	private void fun1()
	{
		System.out.println("function 1 of child class ABC ");
	}

	public static void main(String[] args) {
		
		XYZ x=new XYZ();
		x.fun();
        ABC a=new XYZ();
        a.fun();
        a.fun1();
        a=new ABC();
        a.fun1();
        
        
	}

}
