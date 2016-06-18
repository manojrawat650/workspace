package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of entries: ");
		int n=Integer.parseInt(s.next());
		HashMap<String,String> hm=new HashMap<String,String>(n);
		System.out.println("Enter the names and contact numbers");
		for (int i=0;i<n;i++)
		{ 
			String name=s.next();
			String number=s.next();
			while(number.length()!=8)
			{
				System.out.println("Contact numbers should consist 8 digits");
				number=s.next();
			}
			hm.put(name,number);
		}
		System.out.println("Enter the query");
        for (int j=0;j<n;j++)
        {String query=s.next();
        	System.out.println(query+"="+hm.get(query));
        }
        s.close();
	}

}
