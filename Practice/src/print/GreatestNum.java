package print;
import java.util.*;

public class GreatestNum
{
public static void main(String args[])
{
int arr[]={1,3,2,4,5,3,2,5,3,3,4,4,5,4,3,2};
Arrays.sort(arr);
TreeMap tm=new TreeMap();
for (int i=0;i<arr.length;i++)
{ int count=0;
  for(int j=i;j<arr.length;j++)
   {
	if (arr[i]==arr[j])
	{
		count++;
		tm.put(arr[i],count);
	}
	else
	{
		i=j-1;
		break;
	}
   }
}
System.out.println(tm);
}
}