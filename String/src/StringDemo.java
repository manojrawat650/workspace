
public class StringDemo {

	public static void main(String[] args)
	{
	char ch[]={'m','a','n','o','j'};     
	String s=new String(ch);
	char c[]=s.toCharArray();
	String s1=s;
	if (s==s1)
	{
		System.out.println("yippy");
	}
	else
	{
		System.out.println("oops");
	}
	
	}

}
