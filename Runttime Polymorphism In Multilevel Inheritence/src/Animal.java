
public class Animal 
{
public void eat()
{
	System.out.println("eating");
}
}
class Dog extends Animal
{
	public void eat()
	{
		System.out.println("eating pedigree");
	}
}
class Puppy extends Dog
{
	public void eat()
	{
		System.out.println("Driking milk");
	}	
	public static void main(String arg[])
	{
		Puppy p=new Puppy();    /*All the reference variables are pointing 
		                          towards the object of class puppy*/
		p.eat();
		Dog d=new Puppy();
		d.eat();
		Animal a=new Puppy();
		a.eat();
		
	}
}

