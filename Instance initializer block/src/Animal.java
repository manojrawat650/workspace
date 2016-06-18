
public class Animal {
	String sound; 
	static
	{
		System.out.println("this is static block");
	}
	static
	{
		System.out.println("this is 2nd static block");
	}
	Animal()
	{
		sound="tweet";
		System.out.println("The sound is "+sound);
	}
	
	{
		System.out.println("Initializer block is running first when the object is created");
		sound="quack";        /*when object is created first super() is called in the constructor
		                       after which instance initializer block is copied in the constructor.*/
	}
	public String display()
	{
		return "The animals make sound";
	}

	public static void main(String[] args) 
	{
		String a=new Animal().display();
		 System.out.println(a);
	}

}
