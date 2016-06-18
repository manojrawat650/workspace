


public class CandidateCode 
	{ 
    public static void main(String args[])
    {
    	System.out.println(distributeCadbury(5,7,9,2));
    	System.out.println("sdfggg");
    }
	    public static int distributeCadbury(int input1,int input2,int input3,int input4)
	    { 
	    	int total=0;
	    int a;
	    int b;
	    	int arr1[]=new int[2];
	    	int arr2[]=new int[2];
	    	arr1[0]=input1;
	    	arr1[1]=input2;
	    	arr2[0]=input3;
	    	arr2[1]=input4;
	    for (int i=0;i<2;i++)
	    {
	    	for (int j=0;j<2;j++)
	    	{
             while(arr1[i]>0 && arr2[j]>0)
	        {
            	a=arr1[i]; 
            	b=arr2[j];
	            if (a<b || a>b)
	            {
	                if (a<b)
	                {
	                    b=b-a;
	                }
	                else
	                {
	                    a=a-b;
	                }
	            total=total+1;
	            }
	            else
	            {
	            total=total+1;
	            break;
	            }
	        }
             }
	    }
	        return 99;
	    }
	    }
	


