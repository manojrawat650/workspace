package print;

import java.util.Scanner;

public class NullDemo {
 public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter something");
		String st=s.next();
		if ((st)==(null))
		{
			System.out.println("string is null");
		}
		else if (st.equals(""))
		{
			System.out.println("String is empty");
		}
		else
		{
			System.out.println("not null or empty");
		}

	}

}
