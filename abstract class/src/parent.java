public abstract class parent {
	
	abstract void run();
	public abstract void speed();
	
}
class sub extends parent
{
public void run()
{
 System.out.println("it is running");
}
 public void speed()
{
System.out.println("speed is good");	 
}
public static void main(String []args)
{
parent p=new sub();
p.run();
p.speed();
}
}
