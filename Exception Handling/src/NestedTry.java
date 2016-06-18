
public class NestedTry {
     

	public static void main(String[] args) {
		try{
			String s=null;
			System.out.println(s.length());
			try
			{
				int a=12/0;	
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			try
			{
			
				int b[]=new int[4];
				b[6]=10;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
		}
		catch(Exception e)
		{
			System.out.println("handled"+e);
		}
		System.out.println("normal flow");

	}

}
