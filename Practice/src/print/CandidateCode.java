package print;

public class CandidateCode 
	{ 
	public static void main(String args[])
	{	
	System.out.println(distributeCadbury(1,1,0,1));
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
	    	a=arr1[i];
	    	for (int j=0;j<2;j++)
	    	{  
	    		b=arr2[j];	
             while(a!=0 && b!=0)
	        {	
	            if (a!=b)
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
	            //   System.out.println(total+" "+i+" "+j);
	               } 
	            	else
	                 {
	            		if (a==0 && (b==0))
	            		{
	            			break;
	            		}
	            		else
	            		{
	                      total=total+1;
	   	             //     System.out.println(total+" "+i+" "+j);
	   	                  a=arr1[i];
	                      break;
	                    }
	                 }
	             }
	          }
            }
	          return total;
	    }
	    }
	


