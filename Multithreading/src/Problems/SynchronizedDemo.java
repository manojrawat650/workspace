package Problems;

class Table
{
public synchronized void print(int n) throws InterruptedException
{
	for (int i=1;i<=10;i++)
		{
		System.out.println(i*n);
		}	
}
}
public class SynchronizedDemo extends Thread
{
	Table t;
	 public SynchronizedDemo(Table t)
	 {
		this.t=t;
	 }
	public void run()
	{
		if (Thread.currentThread().getName().equals("thread1"))
		{
		
		try
		{
			t.print(3);
			Thread.sleep(150000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		else if (Thread.currentThread().getName().equals("thread2"))
		{
		
		try
		{
			t.print(5);
			Thread.sleep(150000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	public static void main(String[] args) 
	{
	Table t=new Table();
	SynchronizedDemo t1=new SynchronizedDemo(t);
	t1.setName("thread1");
	SynchronizedDemo t2=new SynchronizedDemo(t);
	t2.setName("thread2");
	t1.start();
	t2.start();
	}
}
