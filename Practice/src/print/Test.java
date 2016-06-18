package print;

import java.util.*;

public class Test {
	
	static int ultimateSum()
	{
		Scanner s=new Scanner(System.in);System.out.println("enter a number");
        int n=s.nextInt();
         int i;
       int sum=0;
        for (int j=0;j<2;j++)
       	 {while(n!=0)
         {
       	  i=n%10;
       	  n=n/10;
       	sum=sum+i;  
         }
       	 if (sum>9)
       	 {
       		 j=0;
       		 n=sum;
       		 sum=0;
       	 }
       	 }
        return sum;
	}
	public static void main(String[] args)
	{
		System.out.println(ultimateSum());
   
         }
	

}
