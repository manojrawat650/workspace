package print;
import java.util.*;
public class FizzBuzzDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
         sc.nextInt();
         sc.nextLine();
         String s[]=sc.nextLine().split(" ");
         int n=s.length;
         for (int j=0;j<n;j++)
         {
        	 int limit=Integer.parseInt(s[j]);
        	 for (int k=1;k<=limit;k++)
        	 {
        		 if (k%5==0 && k%3==0)
        		 {
        			 System.out.println("FizzBuzz");
        		 }
        		 else if (k%5==0)
        		 {
        			 System.out.println("Buzz");
        		 }
        		 else if (k%3==0)
        		 {
        			 System.out.println("Fizz");
        		 }
        		 else
        		 {
        			 System.out.println(k);
        		 }
        	 }
         }
	}

}
