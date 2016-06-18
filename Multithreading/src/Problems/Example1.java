package Problems;

class Print
{
	public synchronized void print()
	{
		for (int i=0;i<5;i++)
		{
			System.out.println(i);
			try
		   {
			if (Thread.currentThread().getName().equals("Thread-0")||Thread.currentThread().getName().equals("Thread-1"))
			{       
			   wait();
			}
			else 
			{
			   notifyAll();
			   wait();
			}
			}
				catch(Exception e)
				{
					
				}
				
			
		}
		
	}
	}
class MyThread1 extends Thread
{
		Print p;
		MyThread1(Print p)
		{
			this.p=p;
		}
			public void run()
			{
				p.print();
			}
		}
class MyThread2 extends Thread
	{
	Print p;
	MyThread2(Print p)
	{
		this.p=p;
	}
		public void run()
		{
			p.print();
		}
	}
class MyThread3 extends Thread
		{
	Print p;
	MyThread3(Print p)
	{
		this.p=p;
	}
			public void run()
			{
				p.print();
			}
	  }

public class Example1
   {
	public static void main(String[] args)
	{
		Print p=new Print();
	MyThread1 m1=new MyThread1(p);	
	MyThread2 m2=new MyThread2(p);
	MyThread3 m3=new MyThread3(p);
	m3.setName("third");
	m1.start();
	m2.start();
	m3.start();
	}

}
