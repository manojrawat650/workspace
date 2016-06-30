package print;
import java.util.*;
public class PracticeClass {

	public static void main(String[] args) {
		boolean flag=false;
		int arr[]=new int[]{12,10,2,7,6};
		
		int arr1[]=new int[arr.length];
		for (int i=0;i<arr.length;i++)
		{
			arr1[i]=arr[i];
		}
		Arrays.sort(arr1);
     for (int i=0;i<arr.length;i++)
     {
    	 for (int j=0;j<arr.length-1;j++)
    	 {int temp;
    		if (arr[j]>arr[j+1])
    		{
    			temp=arr[j];
    			arr[j]=arr[j+1];
    			arr[j+1]=temp;
    		}
    		else
    		{
    			
    		}
    	 }
    	 for (int k=0;k<arr.length;k++)
         {
        	 System.out.print(arr[k]+" ");
         }
    	 System.out.println();
    	
  		 for (int l=0;l<arr.length;l++)
  		 {
  			 if (arr[l]!=arr1[1])
  			 {
  				 break;
  			 }
  			 else
  			 {
  				 if (l==5)
  				 {
  					 flag=true;
  					 break;
  				 }
  			 }
  		 }
    	 
     }
     
	}

}
