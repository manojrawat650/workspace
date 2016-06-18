package interThreadCommunication;

public class TestSleepMethod1 extends Thread
{
public void run()
{
try{
	for(int i=1;i<5;i++)
	{//Thread.sleep(500);
		System.out.println(Thread.currentThread().getName());
	}
}
catch(Exception e)
{}

}
public static void main(String args[])
{
   TestSleepMethod1 t1=new TestSleepMethod1();
   TestSleepMethod1 t2=new TestSleepMethod1();
   t2.start();
   try {
	t1.sleep(10000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
   t1.start();
}
}
