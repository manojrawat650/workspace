
public class StaticNestedClassDemo {
private static int i=10;
static class Inner
{
 public static void fun()
 {
	 System.out.println("static fun "+i);
 }
 public  void fun1()
 {
	
	 System.out.println("non-static fun1");
 }
}
public  static void fun1()
{
	 System.out.println("non-static fun1 2");
}
	public static void main(String[] args) {
		StaticNestedClassDemo.Inner.fun();
		StaticNestedClassDemo.Inner ob=new StaticNestedClassDemo.Inner();
		ob.fun1();

	}

}
