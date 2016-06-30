
class XYZ
{
	private int a=0;
protected static void method()
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
	/*OverridingPrivate ob=new OverridingPrivate();
	ob.method();*/
		XYZ x=new XYZ();
		x.method();
		XYZ x1=new OverridingPrivate();
        x1.method();
        OverridingPrivate o=new OverridingPrivate();
        o.method();
      	}
}
