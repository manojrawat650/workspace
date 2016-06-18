import java.util.*;
public class SortedNumbersDemo {
       public static void getSortedNumbers(int arr[])
       { 
    	   int temp;
    	   for (int i=0;i<arr.length-1;i++)
    	   {  
    		   for (int j=i+1;j<arr.length;j++)
    		   {
    			   temp=arr[j];
    			   if (arr[i]>arr[j])
    			   {
    				   arr[j]=arr[i];
    				   arr[i]=temp;
    				   break;
    			   }
    		   }   
    	   }
    	 System.out.println(arr[0]);
       }
	
	public static void main(String[] args)
       {
		int a[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter five numbers: ");
		a[0]=s.nextInt();
		a[1]=s.nextInt();
		a[2]=s.nextInt();
		a[3]=s.nextInt();
		a[4]=s.nextInt();
		s.close();
		getSortedNumbers(a);
	   }

}
