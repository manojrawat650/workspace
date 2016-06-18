import java.util.*;
public class Palindrome {

	public int getVal()
	{
		Scanner s=new Scanner(System.in);
	 int x=s.nextInt();
	 return x;
	}
	public static void main(String[] args) {
		Palindrome p=new Palindrome();
		int i=p.getVal();
		int var=i;
		int k=0;
		while (var>0)
		{
			var=var/10;
			k++;
		}
		System.out.println("value of k :"+k);
		int j;
		for(int l=0;l<k;l++)
		{
			j=i/10;
			i=i%10;
			System.out.print(i);
			i=j;
		}
	}
}
