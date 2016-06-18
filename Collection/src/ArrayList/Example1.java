package ArrayList;

import java.util.*;
public class Example1 {

	public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	ar.add("manoj");
	ar.add(1);
	ar.add('A');
	ar.add(null);
	ar.add(null);
	ar.add("singh");
	System.out.println(ar);
	Iterator it=ar.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
    ArrayList<String> ar1=new ArrayList<String>();
	ar1.add("delhi");
	ar1.add("bangalore");
	ar1.add("kolkata");
	System.out.println(ar1);
	Iterator<String> it1=ar1.iterator();
	while(it1.hasNext())
	{
		System.out.println(it1.next());
	}
	}

}
