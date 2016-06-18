package interThreadCommunication;


import java.util.Scanner;

class Store
{
int amount;

public synchronized void produce()
{
	for (int i=0;i<10;i++)
	{
 if (amount<10)
 {  
	 amount=amount+1;
	 System.out.println("Produced 1  Remaining: "+amount);
	 if (amount<10)
	 {
		 amount=amount+1;
		 System.out.println("Produced 1  Remaining: "+amount);
		 try{
			 notify();
			 wait();
			 }
			 catch(Exception e)
			 {
				 
			 }
	 }
	 else
	 {
		 try{
			 notify();
			 wait();
			 }
			 catch(Exception e)
			 {
				 
			 }
	 }
 }
	}
}
public synchronized void consume()
{
	for(int i=0;i<10;i++)
	{
 if (amount>0)
 {
	 amount=amount-1;
    System.out.println("consumed 1  Remaining: "+amount);	 
    try{
    	notify();
        wait(500);
    }
    catch(Exception e)
    {
    	
    }
    
 }
	}
}
}
class Producer1 extends Thread
{
	Store s;
	Producer1(Store s)
	{
		this.s=s;
	}
	public void run()
	{
	s.produce();
	}
}
class Consumer2 extends Thread
{	
    Store s;
	Consumer2(Store s)
	{
	this.s=s;
     }
  public void run()
	{
	s.consume();
	}
}
public class ProducerConsumerDemo 
{

	public static void main(String[] args)
	{
		Store s=new Store();
          Producer1 p=new Producer1(s);
          Consumer2 c=new Consumer2(s);
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter initial value: ");
          s.amount=sc.nextInt();
          p.start();
          c.start();
	}

}
