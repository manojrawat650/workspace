package interThreadCommunication;

class Table
{
	Table t;
public synchronized void printodd() 
{
for(int i=1;i<10;i=i+2)
{
try
{
		
		System.out.println(Thread.currentThread().getName()+": "+i);
		wait();
		notify();
	 } 
catch (InterruptedException e) 
{
	}
}		
}
public synchronized void printeven()
{
	for(int i=2;i<=10;i=i+2)
	{
		try
		{
				System.out.println(Thread.currentThread().getName()+": "+i);
				notify();
				wait();
		
		  } 
		 catch (InterruptedException e) {
		
		}
		
	}
	}
    }

class Caller1 extends Thread
{
Table ta;
Caller1(Table ta)
{
this.ta=ta;	
}
public void run()
{
ta.printodd();
}
}
class Caller2 extends Thread
{
Table ta;
Caller2(Table ta)
{
this.ta=ta;	
}
public void run()
{
ta.printeven();
}
}


public class EvenOddDemo {

	public static void main(String[] args) {
		Table t=new Table();
		Caller1 c1=new Caller1(t);
		c1.setName("thread 1");
		c1.setPriority(1);
		Caller2 c2=new Caller2(t);
		c2.setName("thread 2");
		c1.start();
        c2.start();
	}

}
