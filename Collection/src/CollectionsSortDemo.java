import java.util.*;
public class CollectionsSortDemo {

	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		String st[]={"rawat","singh"};
		ar.add("manoj");
		ar.add("kolkata");
		ar.add("newyork");
		ar.add("penguin");
		
		ArrayList ar1=new ArrayList(ar);
		ar1.add("kangaroo");
        
        Iterator it=ar1.iterator();
        while (it.hasNext())
        {
        	System.out.println(it.next());
        }
	}

}
