package print;

import java.util.*;
class Parent 
{Parent()
	{
	System.out.println("super constructor");
	}
public void method()
{
System.out.println("super method");
		}
	static
	{
		System.out.println("static parent");
	}
}
public class NullDemo extends Parent{
	NullDemo()
	{
		super.method();
	System.out.println("child constructor");
	
	}
	static
	{
		System.out.println("static child");
	}
	{
		System.out.println("child initializer block");
	}
	public static void main(String[] args) {
		System.out.println(System.getenv("classpath"));
		NullDemo n=new NullDemo();
	}
}
