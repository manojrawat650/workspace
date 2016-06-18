import java.util.*;


public class HashsetDemo {

	public static void main(String[] args) {
		
		HashSet<String> h=new HashSet<String>();
		String arr[]={"dell","lenovo","hp"};
		h.add("manoj");
		h.add("singh");
		h.add("manoj");
	
		h.add(null);
		h.add(null);
		System.out.println(h);
		HashSet<String> hm=new HashSet<String>();
		hm.add("delhi");
		hm.addAll(h);
		System.out.println(hm);
		Iterator it=h.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("asdfasdf");
		for(String a:h)
		{
			System.out.println(a);
		}
		

	}

}
