abstract class Outer
{
abstract void run();	
}
public class AnonymousDemo { 
	public static void main(String[] args) {
		Outer ob=new Outer(){
			public void run()
			{
				System.out.println("method of outer");
			}
		};
		ob.run();

	}

}
