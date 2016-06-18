class Table
{
public static synchronized void printtable(int n)
{
for(int i=1;i<=10;i++)
{
System.out.println(i*n);	
try
{
Thread.sleep(500);
}
catch(Exception e)
		{
	System.out.println(e);
		}
}
}	
}
class MyThread1 extends Thread
{
public void run()
{
	Table.printtable(2);
}
}
class MyThread2 extends Thread
{
public void run()
{
	Table.printtable(3);
}
}
class MyThread3 extends Thread
{
public void run()
{
	Table.printtable(5);
}
}
public class Mainclass {

	public static void main(String[] args) {
		MyThread1 m1=new MyThread1();
		MyThread2 m2=new MyThread2();
		MyThread3 m3=new MyThread3();
		m1.start();
		m2.start();
		m3.start();
	}

}
