import java.util.Scanner;
public class Stringpalindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=s.next();
		char ch[]=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		System.out.println(str.length());

	}

}
