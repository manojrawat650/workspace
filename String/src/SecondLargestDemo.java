
public class SecondLargestDemo {
	public int getSecondLargest(int a[])
	{	
		for (int i=1;i<=a.length-1;i++)
		{
			
			if (a[0]<a[i])
			{
				a[1]=a[0];
				a[0]=a[i];
	
	     	}
			
	    }
		return(a[1]);   //num at a[1] will be the second largest
	}
	public static void main(String[] args) {
		SecondLargestDemo s=new SecondLargestDemo();
		int arr[]={1,23,2,5,3,67,100,2,0,9};
		System.out.println(s.getSecondLargest(arr));
   }
}
