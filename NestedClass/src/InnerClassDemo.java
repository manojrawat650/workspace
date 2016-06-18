
public class InnerClassDemo {
	private int i=10;
class Inner
{
  public void msg()
  {
	  System.out.println("inner function "+i);
	  message();
  }
}
public void message()
{
System.out.println("Outer class method");	
}
	public static void main(String[] args) {
		InnerClassDemo ob=new InnerClassDemo();
		InnerClassDemo.Inner in=ob.new Inner();
		in.msg();
		

	}

}
