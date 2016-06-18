import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
         a.add("manoj");
         a.add("singh");			//extends AbstractList class and implements list interface
         a.add("manoj");
         a.add("rawat");            //arraylist maintains insertion order
         a.add(new Integer(18));
         Iterator it=a.iterator();
         while(it.hasNext())        
         {
        	 System.out.println(it.next());
         }
         System.out.println(a.remove(1));
         System.out.println("now the elements in the arraylist are: "+a);
         System.out.println("now the element at position 1 is: "+a.get(1));
       
	}

}
