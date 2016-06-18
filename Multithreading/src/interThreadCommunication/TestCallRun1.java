package interThreadCommunication;

public class TestCallRun1 extends Thread{
public void run()
{
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
System.out.println("run method called");	
}
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		 TestCallRun1 t= new TestCallRun1();
		 
		 t.start();
		 t.run();
		 t.run();
	}

}
