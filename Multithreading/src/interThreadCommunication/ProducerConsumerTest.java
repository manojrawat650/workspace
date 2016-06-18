package interThreadCommunication;

class Transit
{
	int amount=0;
	int total=0;
	boolean available=true;
public synchronized void produce()
{
	
	for (int i=0;i<10;i++)
	{
		amount=i;
		System.out.println("producing :"+i);
		while (available==true)
		{try{
		wait();
		   }
		catch(Exception e)
		{
			System.out.println(e);
		}}
		available=true;
		notifyAll();
	}
}
public synchronized void consume()
{   
	for (int i=0;i<10;i++)
	{
	 System.out.println("consuming :"+amount);
	 total=total+amount;
	 System.out.println("Total quantity consumed: "+total);
	 while(available==false)
	 {try{
			wait();
			   }
			catch(Exception e)
			{
				System.out.println(e);
			}}
			available=false;
			notifyAll();
	}
	 
}
}
class Producer extends Thread
{  Transit ta;
	Producer(Transit t)
	{
		ta=t;
	}
  public void run()
  {
	  ta.produce();
  }
}
class Consumer1 extends Thread
{  Transit ta;
    Consumer1(Transit t)
	{
		ta=t;
	}
  public void run()
  {
	  ta.consume();
  }
}
public class ProducerConsumerTest {

	public static void main(String[] args) {
		Transit t=new Transit();
		Producer p=new Producer(t);
		Consumer1 c=new Consumer1(t);
		c.start();
		p.start();

	}

}
