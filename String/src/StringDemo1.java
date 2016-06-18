
public class StringDemo1 {

	public static void main(String[] args) {
		String s1="sachin";
		String s2="sachin";
		String s3=new String("sachin");
		String s4=s1;
		
		if (s1==s3)  //== returns true if the objects are same
		{System.out.println("true");}
		else
		{
			System.out.println("false");
		}
		if (s1.equals(s3))  // returns true if the values are same 
		{
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}

	}

}
