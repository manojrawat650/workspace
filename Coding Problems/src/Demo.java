class Demon
{
	public void don()
{
		System.out.println("large");
}
	}
public class Demo extends Demon{
private int i;
Demo()
{
	
	}
Demo(int i)
{
	this();
	super();
	this.i=i;
	}
public void don()
{
	System.out.println("small");
	}
void display()
{System.out.println();
this.don();
	super.don();
	

	}

	public static void main(String[] args) {
		Demo d=new Demo(2);
		d.display();
         
	}

}
