package print;
import java.util.*;
public class ConvertTimeDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
	    if (s1.contains("AM"))
	    {
	    	if (s1.substring(0,2).equals("12"))
	    	{
	    		char c[]=s1.toCharArray();
	    	    c[0]='0';
	    	    c[1]='0';
	    	    s1=new String(c);
	    	    s1=s1.substring(0,s1.length()-2);
	    	}
	    	else
	    	{
	    		s1=s1.substring(0,s1.length()-2);
	    	}		
	    }
	    else
	    {
	    	if (s1.substring(0,2).equals("12"))
	    	{
	    		s1=s1.substring(0,s1.length()-2);
	    	}
	    	else
	    	{
	    	 int i=Integer.parseInt(s1.substring(0,2));
	    	 i=i+12;
	    	 s1=s1.replace(s1.substring(0,2),String.valueOf(i));
	    	 s1=s1.substring(0,s1.length()-2);
	    	}	
	    }
	    System.out.println(s1);
	}

}
