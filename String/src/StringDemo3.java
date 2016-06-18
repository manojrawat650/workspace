
public class StringDemo3 {

	public static void main(String[] args) {
	String s="manoj singh";
	char c[]=s.toCharArray();
	char c1[]=new char[s.length()];
	int j=0;
	for (int i=s.length()-1;i>=0;i--)
	{
		
		c1[j]=c[i];
		j=j+1;
	
		
	}
	String s1=new String(c1);
	System.out.println(s1);
       
       }
       
       


}
