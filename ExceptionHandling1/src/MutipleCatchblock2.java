
public class MutipleCatchblock2 {

	public static void main(String[] args) {
		try
		{
			
			int []b=new int[4];
			b[4]=10/0;
			int c=10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
