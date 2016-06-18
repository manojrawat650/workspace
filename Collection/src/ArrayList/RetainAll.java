package ArrayList;

import java.util.*;

public class RetainAll {

	public static void main(String[] args) {
		ArrayList ar1=new ArrayList();
		ar1.add("delhi");
		ar1.add("mumbai");
		ar1.add("kolkata");
		
		ArrayList ar2=new ArrayList();
		ar2.add("chennai");
		ar2.add("bengaluru");
		ar2.add("pune");
		ar2.remove(2); /*removes the element at index 2 of ar2*/
		
		ar1.addAll(ar2);  /*adds all the elements of 2nd list as separate elements*/
		System.out.println(ar1);
		
		ar1.retainAll(ar2); /*retains the elements of the 2nd array and deletes everything else*/
		System.out.println("the elements in ar1 now are: "+ar1);
	}

}
