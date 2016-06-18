import java.util.*;


public class HashmapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(1,"manoj");
        hm.put(null,"kapil");
        hm.put(2,"manoj");
        Set s=hm.entrySet();
        Iterator it=s.iterator();
        while (it.hasNext())
        {
        	System.out.println(it.next());
        }
        while (it.hasNext())
        {
        	Map.Entry m=(Map.Entry)it.next();
        	System.out.println(m.getKey());
        	System.out.println(m.getValue());
        }
        
	}

}
