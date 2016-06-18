
public class ReturnSumOfNumbers {

	public static void main(String[] args) {
       String st=new String("manoj1singh9rawat5");
           char ch[]=st.toCharArray();
           int sum=0;
           
         for (int i=0;i<ch.length;i++)
         {
        	 for(int j=0;j<10;j++)
        	 {
        		 int x=Character.getNumericValue(ch[i]);
        		if(j==x)
        		{ 
        			sum=sum+j;
        			break;
        		}
        		else
        		{
        			
        		}
        	 }
          }
        System.out.println("The sum of numbers is: "+sum );
	}

}
