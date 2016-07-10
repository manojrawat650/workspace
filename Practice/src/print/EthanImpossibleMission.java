package print;
import java.util.*;
public class EthanImpossibleMission {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1[]=sc.nextLine().split(" ");
		int N=Integer.parseInt(s1[0]);
		int Q=Integer.parseInt(s1[1]);
		int M=Integer.parseInt(s1[2]);
		String s2[]=sc.nextLine().split(" ");
       int I[]=new int[N];
		for (int i=0;i<N;i++)
       {
    	   I[i]=Integer.parseInt(s2[i]);
       }
		int arr[]=new int[Q];
		for (int i=0;i<Q;i++)
		{
			int a=sc.nextInt();
			int temp=1;
			for (int j=0;j<N;j++)
			{
				if (j!=a-1)
				{
					temp=temp*I[j];
				}
				else
				{
					
				}
				
			}
			arr[i]=temp%M;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
