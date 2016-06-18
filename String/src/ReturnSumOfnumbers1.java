
public class ReturnSumOfnumbers1 
    {
	 int sumString(String input)
	 {
	    int output = 0;
	    for (String token : input.split(" "))
	    {
	        try
	        {
	            output += Integer.parseInt(token);
	        }
	        catch (Exception error)
	        {
	        }
	    }
	    return output;
	 }
	public static void main(String[] args)
	            {
		ReturnSumOfnumbers1 ob= new ReturnSumOfnumbers1();
	 System.out.println(ob.sumString("12 1asd1 sdf 6 6"));
	 	}
     }
