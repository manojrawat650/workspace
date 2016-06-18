package Practice;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try
		{
			int x=Integer.parseInt(s.next());
		    int y=Integer.parseInt(s.next());
		    int z=x/y;
		    System.out.println(z);
		}
		catch (ArithmeticException e){System.out.println(e);}
		catch (NumberFormatException e){System.out.println("java.util.InputMismatchException");}
	}

}
