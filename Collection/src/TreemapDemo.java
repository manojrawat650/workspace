import java.util.*;
public class TreemapDemo {

	public static void main(String[] args) {
	TreeMap<String,String> t=new TreeMap<String,String>();
	t.put("manoj","employee");
	t.put("1","bangalore");
	t.put("2","delhi");
	
	t.put("asf","delhi");
	System.out.println(t);
	Set s=t.entrySet();
	Iterator it=s.iterator();
	while(it.hasNext())
	{
		Map.Entry m=(Map.Entry)it.next();
		System.out.println(m.getKey()+" "+m.getValue());
	}
	
	}

}
