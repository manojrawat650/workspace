package print;

import java.util.*;

public class Checkunique {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.println("Enter any string");		
        char ch[]=s.next().toCharArray();
        for (int i=0;i<ch.length;i++)
        {
        	for (int j=i+1;j<ch.length;j++)
        	{
        		if (ch[i]==ch[j])
        		{
        			System.out.println("not unique");
        			break;	
        		}
        	
        		
        	}
        	
        break;
        }
	}

}
