package print;

import java.util.*;

public class BubbleSortDemo {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter numbers");
		String st[]=s.nextLine().split(" ");
		int arr[]=new int[st.length];
		int arr2[]=new int[st.length];
		int flag=0;
        for(int i=0;i<st.length;i++)
        {
       	    arr[i]=Integer.parseInt(st[i]);
        	arr2[i]=Integer.parseInt(st[i]);
        }
        Arrays.sort(arr2);
       
        for(int j=0;j<st.length;j++)
        {
       for (int i=0;i<st.length-1;i++)
       {
    	   int temp=0;
    	   if (arr[i]>arr[i+1])
    	   {
    		   temp=arr[i];
    		   arr[i]=arr[i+1];
    		   arr[i+1]=temp;
    	   }
       }
       for (int l=0;l<st.length;l++)
       {
    	  System.out.print(arr[l]+" ");
       }
       System.out.println();
       for (int k=0;k<st.length;k++)
       {
    	   if (arr[k]==arr2[k])
    	   {
    		   if (k==st.length-1)
    		   {
    			   flag=1;
    		   }
    	   }
    	   else
    	   {56
    		   break;
    	   }   
       }
       if (flag==1)
       {
    	   for (int l=0;l<st.length;l++)
           {
        	  System.out.print(arr[l]+" ");
           } 
    	   break;
       }
       
       }
	}

}
