
public class TestInterruptingThread2 extends Thread
{
public void run()
{
System.out.println("thread is running");
try
{
Thread.sleep(500);	
}
catch(Exception e)
{
	System.out.println("Thread is interrupted");
System.out.println(e);	
}

}
	public static void main(String[] args)
	{		
		TestInterruptingThread2 t1=new TestInterruptingThread2();
		t1.start();
		
		try{
			System.out.println("gdfg");
			
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		
	}

}
