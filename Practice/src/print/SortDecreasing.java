package print;

import java.util.Arrays;

public class SortDecreasing {

	public static void main(String[] args) {
		int arr[]={1,2,4,2,5,3,6,6,6,7,3,5,2,9};
        Arrays.sort(arr);
        int count0=1;
        int count1=1;
        for (int i=0;i<arr.length;i++)
        {
        	for (int j=i;j<arr.length;j++)
        	{
        		if (arr[i]==arr[j])
        		{
        			count0++;
        		}
        		else
        		{
        		  count1=count0;	
        		}
        	}
        }
	}

}
