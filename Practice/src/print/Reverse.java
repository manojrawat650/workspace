package print;

import java.util.*;

public class Reverse
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string");
        String s=sc.next();
        char ch[]=s.toCharArray();
        char ch1[]=new char[ch.length];
        for (int i=1;i<=ch.length;i++)
        {
        	ch1[i-1]=ch[ch.length-i];
        	System.out.print(ch[ch.length-i]);
        }
        String s1=new String(ch1);
        if (s1.equals(s))
        {
        	System.out.println(" a palindrome");
        	
        }
        else
        {
        	System.out.println(" not a palindrome");
        }
        
        
	}

}
