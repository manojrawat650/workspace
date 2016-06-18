package print;

import java.util.Scanner;

public class Stairs {
	Scanner sc=new Scanner();
int s=sc.nextInt();
numbers=new int[s];
for (int i=0;i<s;i++)
{
	numbers[i]=s.nextInt();
	total=total+numbers[i];
}
return total;

	public static void main(String[] args) {
	   
       for (int i=n;i>=1;i--)
       {
    	for (int j=1;j<=n;j++)
    	{
    		if (j<i)
    		{
    			System.out.print(" ");
    		}
    		else
    		{
    			System.out.print("#");
    		}
    	}
    	System.out.println();
       }
	}

}
