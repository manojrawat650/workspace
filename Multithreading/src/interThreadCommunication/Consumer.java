package interThreadCommunication;

import java.util.Scanner;

class Transaction
{
	int amount=10000;
	public synchronized void withdraw(int n)
	{
		if (n<amount)
		{
			System.out.println("insufficient balance");
			try
			{
				wait();
				}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		{
			System.out.println("processing transaction");
		amount=amount-n;
		System.out.println("amount withdrawn");
		System.out.println("current balance: "+amount);
	    }
	}
	public  synchronized void deposit()
	{
		System.out.println("Deposit some money");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
			amount=amount+n;
		System.out.println("amount added");
		notifyAll();
	}
}
class Withdraw extends Thread
{
	Transaction t;
	Withdraw(Transaction t)
	{
		this.t=t;
	}
	public void run()
	{
		t.withdraw(5000);
	}
}
class Deposit extends Thread
{
     Transaction t;
     Deposit(Transaction t)
     {
    	 this.t=t;
     }
     public void run()
     {
    	 t.deposit();
     }
}
public class Consumer {

	public static void main(String[] args) {
		Transaction t=new Transaction();
		Withdraw w=new Withdraw(t);
        Deposit d=new Deposit(t);
        w.start();
        d.start();
	}

}
