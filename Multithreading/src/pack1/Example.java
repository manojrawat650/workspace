package pack1;

public class Example extends Thread{
	Example e;
 public void run()
 {	 
System.out.println("running");	
 }
	public static void main(String[] args) 
	{
	Example ob1=new Example();
	Example ob2=new Example();
	ob1.start();
	ob2.start();

	}

}
