
class XYZ
{
private static void method()
{
System.out.println("method of super class");	
}
}
public class OverridingPrivate extends XYZ
{
private static void method()
{
System.out.println("method of subclass");	
}
	public static void main(String[] args) 
	{
	OverridingPrivate ob=new OverridingPrivate();
	ob.method();
	OverridingPrivate x=new OverridingPrivate();
	x.method();

	}

}
