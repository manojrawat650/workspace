package print;
import java.util.*;
public class PerfectSquare {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    for (int i=1;i<=n/2;i++)
    {
    	if (n==(i*i))
    	{
    		System.out.println("perfect square");
    	    break;
    	}
    	else if(i==n/2)
    	{
          System.out.println("not a perfect square");
    	}
    	else
    	{
    		
    	}
    }
	}

}
