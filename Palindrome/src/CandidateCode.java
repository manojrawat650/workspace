public class CandidateCode 
	{ 
    public static void main()
    {
    	distributeCadbury(5,2);
    }
	    public static int distributeCadbury(int input1,int input3)
	    { int total=0;
	        for (int i=0;i<=10;i++)
	        {
	            if (input1<input3 || input1>input3)
	            {
	                if (input1<input3)
	                {
	                    input3=input3-input1;
	                }
	                else
	                {
	                    input1=input1-input3;
	                }
	            total=total+1;
	            }
	            else
	            {
	            total=total+1;
	            break;
	            }
	        }
	        return total;
	    }
	}



