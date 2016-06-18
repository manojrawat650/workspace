package Sychronized;


class Print
{
public void printOdd()
{
	for(int i=1;i<=10;i=i+2)
	{
		System.out.println("one"+Thread.currentThread().getName());
		try{
		wait(10000);
		System.out.println("twooo"+Thread.currentThread().getName());

		}
		catch(Exception e)
		{}
	}
}
public void printEven()
{
	for(int i=2;i<=10;i=i+2)
	{
		System.out.println("two");
		try{
			notify();
			}
			catch(Exception e)
			{}
	}
}
}
class MyClass1 extends Thread
{
	Print p;
	MyClass1(Print p)
	{
		this.p=p;
	}
public void run()
{
	p.printOdd();
	
	}

}
class MyClass2 extends Thread
{
	Print p;
    MyClass2(Print p)
	{
		this.p=p;
	}
public void run()
{
p.printOdd();
}

}

public class OddEvenExample {

	public static void main(String[] args) throws InterruptedException 
	{
		Print p=new Print();
		MyClass1 m1=new MyClass1(p);
		MyClass2 m2=new MyClass2(p);
		m1.start();
		m2.start();
		m1.join();
	}

}
