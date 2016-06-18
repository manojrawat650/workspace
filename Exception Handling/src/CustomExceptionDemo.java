
public class CustomExceptionDemo extends Exception{
public static void invalidAge(int age) throws CustomExceptionDemo
{ 
	if (age<18)
		{
		throw new CustomExceptionDemo("invalid age");
		}
	else
	{
		System.out.println("valide age");
	}
	}
CustomExceptionDemo(String s)
{
super(s);	
}
}
class Manoj
{
public static void main(String args[])
{ try{
	CustomExceptionDemo.invalidAge(15);
}
catch(Exception e)
{
	System.out.println(e);
}
}
}


