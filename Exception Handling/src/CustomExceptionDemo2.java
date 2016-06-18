class AnimalException extends Exception
{
AnimalException(String s)
{
	super();
}
}
public class CustomExceptionDemo2 {
	static public void validate(int legs) throws AnimalException
	{
		if (legs<4)
		{
			throw new AnimalException("not an animal");
		}
		else
		{
			System.out.println("this is an animal");
		}
	}
	public static void main(String[] args) 
	{
		try{
	validate(6);
		}
		catch(Exception e)
		{
			System.out.println("animal should have more than 3 legs");
		}
	}

}
