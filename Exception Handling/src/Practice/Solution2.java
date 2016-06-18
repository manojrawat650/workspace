package Practice;
import java.util.*;

public class Solution2 {
static void power(int n,int p)
{
	
    try{
    	if (n<0 || p<0)
     {
   	 throw new Exception("n and p should be non-negative");
     }
    else
    {
   	 int temp=1;
   	 for  (int i=0;i<p;i++)
   	 {
   		 temp=temp*n;
   	 }
   	 System.out.println(temp);
    }
    }
    catch(Exception e)
    {
   	 System.out.println(e);
    }
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    String st[]=s.nextLine().split("\\s");
	    int n=Integer.parseInt(st[0]);
	    int p=Integer.parseInt(st[1]);
	    power(n,p);
	}

}
