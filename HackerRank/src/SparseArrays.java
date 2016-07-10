import java.util.*;
public class SparseArrays
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
String arr[]=new String[N];
for (int i=0;i<N;i++)
{
	arr[i]=sc.next();
}
int Q=sc.nextInt();
int num[]=new int[Q];
for (int j=0;j<Q;j++)
{
	int count=0;
String s=sc.next();
for (int i=0;i<N;i++)
{
if (s.equals(arr[i]))
{
	num[j]=++count;
	}
}
}
for (int k=0;k<num.length;k++)
{
	System.out.println(num[k]);
	}
}
}

