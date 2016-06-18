package HashMap;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(1,"manoj");
		h.put(2,"singh");
		h.put(null,"rawat");
		h.put(5,"msr");
		
		for(Map.Entry m:h.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());	
		}
	}

}
