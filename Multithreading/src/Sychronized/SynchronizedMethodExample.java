package Sychronized;

class Table1
{
public synchronized void printTable(int n)
{
	for(int i=1;i<=10;i++)
	{
	System.out.println(i*n);
	}
}
}
class MyClass1 implements Runnable
{
	Table1 t;
	public MyClass1(Table1 t)
	{
		this.t=t;
	}
public MyClass1(Print p) {
		// TODO Auto-generated constructor stub
	}
public void run()
{
	t.printTable(3);
}
public void start() {
	// TODO Auto-generated method stub
	
}

}
class MyClass2 implements Runnable
{
   Table1 t;
   public MyClass2(Table1 t)
	{
		this.t=t;
	}
public MyClass2(Print p) {
	// TODO Auto-generated constructor stub
}
public void run()
{
 t.printTable(5);	
}
public void start() {
	// TODO Auto-generated method stub
	
}
}

public class SynchronizedMethodExample {

	public static void main(String[] args) {
		Table1 t=new Table1();
		MyClass1 ob1=new MyClass1(t);
		MyClass2 ob2=new MyClass2(t);
		Thread t1=new Thread(ob1);
		Thread t2=new Thread(ob2);
		t1.start();
		t2.start();

	}

}
