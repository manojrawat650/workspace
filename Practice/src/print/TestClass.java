package print;
import java.util.*;
public class TestClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.nextLine();
		String st="";
		int total[]=new int[N];
for (int i=0;i<N;i++)
{
	String s=sc.nextLine();
	
	int max=0;
	int sum=0;
    
    total[i]=0;
	char ch[]=s.toCharArray();
	for (int j=0;j<ch.length;j++)
	{
		
		if (ch[j]=='C')
		{
			sum++;
		}
		else 
		{
			if (sum>total[i])
			{
	         	total[i]=sum;
	         	System.out.println("sum:"+sum);
	         	System.out.println("total"+total[i]);
		        sum=0;
			}
		}
		
		
		
	}
	st=st+s;
Arrays.sort(total);
	
}
char c[]=st.toCharArray();
int x=0;
int x1=0;
for (int k=0;k<st.length();k++)
{
	if (c[k]=='C')
	{
	x++;	
	}
	else
	{
		if (x>x1)
		{
		x1=x;
		x=0;
		}
	}
}
System.out.println(total[N-1]+" "+x1);
	}

}
