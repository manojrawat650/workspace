
public class Animal 
{
 public void sound()
 {
	 System.out.println("the animal makes sound");
 }
}
class Dog extends Animal
{
	public void sound()
{
	 System.out.println("the Dog barks");
}
	}
class  Puppy extends Dog
{
	public static void main(String args[])
	{
		Animal a=new Puppy();
		a.sound();
	}
}