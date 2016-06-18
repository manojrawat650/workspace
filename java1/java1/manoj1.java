package java1;

public class manoj1 extends manoj{
	static int a=10;
	int b=20;
private int sum;
	manoj1()
{
int a=10;
int b=20;
sum= a+b;
}
	manoj1(int a,int b)
	{
		sum=a+b;
		a=15;
	}
	public void print()
	{
		System.out.println("the value of sum is; "+sum);
	}
	
public static void main(String []args)
{
	a=12;
manoj1 m=new manoj1();
m.print();
manoj1 m1=new manoj1(2,7);
m1.print();
m.fun();
m1.fun();
System.out.println("value of a: "+a);
System.out.println("value of a: "+m.a);
}

}
