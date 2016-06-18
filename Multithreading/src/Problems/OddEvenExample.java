package Problems;

class Print1
{
  public synchronized void printEven()
   {
     for (int i=0;i<=10;i=i+2)
     {
      System.out.println(i);
     try{ notify();
      wait();
     }
     catch(Exception e)
     {
     }
     }
   }
  public synchronized void printOdd()
   {
     for (int i=1;i<=10;i=1+2)
      {
       System.out.println(i);
      /* try{ notify();
        wait();
      }
      catch(Exception e)
      {
      }*/
      }
   }
}
class Even extends Thread
{
	Print1 p;
	Even(Print1 p)
	{
	this.p=p;	
	}
    public void run()
    {
    	p.printEven();
	}
}
class Odd extends Thread
{
	Print1 p;
	Odd(Print1 p)
	{
	this.p=p;	
	}
  public void run()
    {
	  p.printOdd();
	}
}
public class OddEvenExample 
{
	public static void main(String[] args)
	{
	  Print1 p=new Print1();
	  Even e=new Even(p);
	  Odd o=new Odd(p);
	  e.start();
	  o.start();
	  
    }
}
