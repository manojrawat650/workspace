package print;

public class Fibonacci {

	public static void main(String[] args) {	

		int a=0;
		int b=1;
		int sum;
		System.out.println(a);
		System.out.println(b);
		for (int i=0;i<8;i++)
		{
			sum=a+b;
			a=b;
			b=sum;
			System.out.println(sum);
		}
	}
	public static int fibo(int n)
	{
		int i=1;
		int j=2;
		int sum=0;
          if (n==1)	
          {
        	  return 1;
          }
          else if(n==2)
          {
        	  return 2;
          }
          else
          {
        	 return fibo(n-1)+fibo(n-2);
          }
          System.out.println(i);
          System.out.println(j);
          int sum=i+j;
          i=j;
          j=sum;
          if (sum<10)
          fibo(n);
		
	}
	

}
