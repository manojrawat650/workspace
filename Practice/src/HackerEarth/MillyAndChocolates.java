package HackerEarth;
import java.util.*;
public class MillyAndChocolates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
             int N=sc.nextInt();       //No of boxes
             sc.nextLine();
             String number[]=sc.nextLine().split(" ");   //Number of chocolates in each box
             ArrayList ar[]=new ArrayList[N];           //creating N boxes
             long time1=System.currentTimeMillis();
            for (int i=0;i<N;i++)
            {
            	ar[i]=new ArrayList();
            	int a=0;
            	if (i==0)
            	{
            	a=0;	
            	}
            	else
            	{
            	a=Integer.parseInt(number[i-1]);
            	}
            	int b=Integer.parseInt(number[i]);
            	
            	for (int j=a+1;j<=a+1+b;j++)
            	{
            		ar[i].add(j);
            	}
            }
            int Q=sc.nextInt();
            int array[]=new int[Q];
            for (int i=0;i<Q;i++)
            {
            	array[i]=sc.nextInt();
            	
            }
            for (int k=0;k<Q;k++)
            { for (int j=0;j<N;j++)
        	 {
            	
            		if (ar[j].contains(array[k])==true)
            	        {System.out.println(j+1);
            		break;}
                }
        		
            }
	    long time2=System.currentTimeMillis();
	    System.out.println(time2-time1);
	}

}
