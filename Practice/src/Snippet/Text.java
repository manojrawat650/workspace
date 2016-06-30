package Snippet;

class Parent
{
Parent()
{
	}
public void fun()
{
	}
}
public class Text extends Parent
{
	public void fun()
	{
		Parent p=new Text();
		p.fun();
	}
	
	
	
	
}
