package print;

public class MergeDemo {

	public static void main(String[] args) {

System.out.println(mergeStrings("a z","s fd"));

	}
	static String mergeStrings(String a, String b) {
      char ch1[]=a.toCharArray();
      char ch2[]=b.toCharArray();
      int length=ch1.length+ch2.length;
      char[] ch3=new char[length];
      int count1=0;
      int count2=0;
		for (int i=0;i<length;i++)
		{
			
			if (i%2==0)
			{
				try
				{
					ch3[i]=ch1[count1];
				
				count1++;}
				catch(Exception e)
				{
					ch3[i]=ch2[count2];
					count2++;
				}
			}
			else
			{
				try
				{
				ch3[i]=ch2[count2];
				count2++;
				}
				catch(Exception e)
				{
					ch3[i]=ch1[count1];
					count1++;
				}
			}
		}
	
	String mergedString=new String(ch3);
		return mergedString;
    }

}
