package print;

public class Demo {

	public static void main(String[] args){
	
	
		for (int i=0;i<10;i++)
		{
			try
			{
				if (i==5)
				throw new ArithmeticException("1234");
				else
					System.out.println("adfasdf");
				
			}
		catch(Exception e)
			{
			System.out.println("caught");
			}	
		   finally
			{
		    	System.out.println("manoj");
			}
		}
	}
	
	}
