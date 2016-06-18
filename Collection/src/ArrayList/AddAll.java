package ArrayList;

import java.util.*;

public class AddAll {

	public static void main(String[] args) {
		
		ArrayList ar1=new ArrayList();
		ar1.add("abc");
		ar1.add("def");
		ar1.add("ghi");
		ArrayList ar2=new ArrayList();
		ar2.add("jkl");
		ar2.add("mno");
		
		ar1.addAll(ar2);
		System.out.println("the elements now in ar1 are: "+ar1);
		ar1.removeAll(ar2);
		System.out.println("the elements now are: "+ar1);
		int arr[]={1,2};
		ar1.add(arr);
		System.out.println(ar1);
	}

}
