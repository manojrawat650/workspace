import java.util.*;
class Generic
{
  public void printArray(List a)
  {
	  
	Iterator it=a.iterator();
    while(it.hasNext())
    {
    	System.out.println(it.next());
    }
  }
}
public class JavaGenericsDemo {

	public static void main(String[] args)
	{
		int arr[]={1,2,3};
	    String st[]={"Hello","World"};
	    Generic ob=new Generic();
        ob.printArray(Arrays.asList(arr));
        ob.printArray(Arrays.asList(st));
	}

}
