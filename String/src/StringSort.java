import java.util.*;

public class StringSort {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String ");
		String s=sc.next();
		char ch[]=s.toCharArray();
          ArrayList<Character> ar=new ArrayList<Character>();
          for(int i=0;i<ch.length;i++)
          {
        	  ar.add(ch[i]);
          }
          Collections.sort(ar);
          Iterator it=ar.iterator();
          while(it.hasNext())
        		  {
        	System.out.println(it.next());  
          }
	}

}
