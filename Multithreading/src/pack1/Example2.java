package pack1;

class First implements Runnable{
public void run()
{
	System.out.println("first thread running");
}
}
class Second implements Runnable{
public void run()
{
	try{
	Thread.sleep(200);
	System.out.println("second thread running");
	}
	catch(InterruptedException e)
	{System.out.println(e);}
}
}
public class Example2
{
	public static void main(String[] args) 
	{
		First f=new First();
		Second s=new Second();
	
	Thread t1=new Thread(f);
	Thread t2=new Thread(s);
	t1.run();
	t2.run();
	}
	}
	


