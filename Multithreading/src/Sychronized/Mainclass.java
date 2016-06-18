package Sychronized;

class Table
{
public synchronized void printTable(int n) throws InterruptedException
{
	System.out.println(Thread.currentThread().getName());
	   for(int i=1;i<=10;i++)
		{
		  
			   wait(500);
			   System.out.println("hello");
			   System.out.println(i*n);
		    
		   
		
		  
		 
}
}
}
class MyThread1 extends Thread 
{
	Table a;
	MyThread1(Table a)
	{
	this.a=a;
	}
public void run()
{
	try{
	a.printTable(3);
}
	catch(InterruptedException e)
	{
		}
	}
}
class MyThread2 extends Thread
{
	Table a;
	MyThread2(Table a)
	{
	this.a=a;
	}
public void run()
{
	try {
		a.printTable(5);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
public class Mainclass {

	public static void main(String[] args)
	{
   Table a=new Table();
   MyThread1 m1=new MyThread1(a);
   MyThread2 m2=new MyThread2(a);
   m1.start();
   try{
   m1.join();
   }
   catch(Exception e)
   {
	   
   }
   m2.start();
	}

}

