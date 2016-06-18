
public class Example {
	
	public static void main(String args[])
	{
		int i=10;
		int j=20;
		int k=30;
		Integer a=new Integer(i);
		Integer b=Integer.valueOf(j);
		Integer c=k;   //compiler converts to Integer c=Integer.valueOf(k) internally
		Integer d=new Integer(40);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
}
