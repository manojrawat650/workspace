package print;
import java.util.*;
public class BigDecimal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n];
        Double []d=new Double[n];
        for (int i=0;i<n;i++)
        {
        d[i]=sc.nextDouble();
        }
        for (int j=0;j<n-1;j++)
        	{
        	double temp=d[j];
        	for(int k=j+1;k<n;k++)
        	if (d[j]<d[k])
        	{
        		d[j]=d[k];
        		d[k]=temp;
        	}
        	else if (d[j]==d[k])
        	{
        		temp=d[j+1];
        		d[j+1]=d[k];
        		d[k]=temp;
        	}
        	else
        	{
        		
        	}
        
        	}
        
        for (int i=0;i<n;i++)
        {
        	System.out.println(d[i].toString());
        }


	}
	}
