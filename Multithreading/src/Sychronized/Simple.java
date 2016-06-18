package Sychronized;

class MyClass
{
	MyClass()
	{
		
	}
public synchronized void print1()
{
for (int i=0;i<10;i++)
{
	try{
	wait(1000);
	}
	catch(Exception e)
	{
		
	}
System.out.println("one");	
}
}
public synchronized void print2()
{
for (int i=0;i<10;i++)
{
System.out.println("two");	
}
}
}

public class Simple extends Thread {
MyClass m;
	Simple(MyClass m)
{
	this.m=m;
}
	public void run()
	{
		m.print1();
		m.print2();
	}
	public static void main(String[] args) {
		MyClass m=new MyClass();
		Simple t1=new Simple(m);
		Simple t2=new Simple(m);
		t1.start();
		t2.start();
	}

}
