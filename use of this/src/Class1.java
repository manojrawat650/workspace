
public class Class1 {
	int num=10;
	String s="Singh";
	public Class1()
	{
		System.out.println("this is the default construtor and value of num is :"+num);	
	}
	Class1(int a)
	{
		this.num=a;
		System.out.println("this is the constructor with an parameter and value of num is :"+num);
	}
	public void display()
	{
		System.out.println("value of num: "+num);
	}
	public void dis()
	{
		
		System.out.println("value of s is: "+s);
		display();
	}
	public Class1(String s)
	{
		System.out.println("this is the Constructor with string as parameter and value of num is:"+num+" and value of s is:"+s);
	 /*again value of num is printed as 10 because the values of instance variables are initialized*/
	}
	public static void main(String[] args)
	{
		Class1 c=new Class1();
		 c=new Class1(15);
		 c.display();
		 c.dis();
		 c=new Class1("manoj");
    }

}
