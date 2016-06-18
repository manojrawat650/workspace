
package findOdd;

import java.util.Scanner;

public class ABC {
 
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int i=s.nextInt();
		System.out.println("Enter a number");
		int k,sum=0;
          for (int j=0;j<i;j++)
          { 
        	  k=i%10;
        	  i=i/10;
        	  if (k%2!=0)
        	  {
        	     sum=sum+k;
        	  }
        	  else
        	  {}
        	  
          }
          System.out.println("sum of odd digits is :"+sum);
	}

}
