package java3;

public class ABC {
public void display()
{
	}
void diploma()
{System.out.println("hgf");
	}
protected void deploy()
{
	}
private void disp()
{
	}


}
class XYZ extends ABC
{
	ABC a= new ABC();
	public void method()
	{
display();
diploma();
deploy();
	}
	public static void main(String[] args)
	{
		ABC a=new ABC();
		ABC b=new ABC();
		a=b;
		System.out.println(a);
		System.out.println(b);
		a.diploma();
		
	}
}
