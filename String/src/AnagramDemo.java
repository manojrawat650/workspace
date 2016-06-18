import java.util.*;
public class AnagramDemo
  {
	public static void isAnagram(String s1,String s2)
	  {
		char ch1[]=s1.toLowerCase().toCharArray();
		char ch2[]=s2.toLowerCase().toCharArray();
		char temp;
		if(s1.length()!=s2.length())
		{
			System.out.println("Not Anagrams");
		}
		else
		{
			for (int i=0;i<ch1.length;i++)
			{
				for (int j=i;j<ch2.length;j++)
				{ 
					temp=ch2[i];  
					if (ch1[i]==ch2[j])
					{   
						ch2[i]=ch2[j];
						ch2[j]=temp;
						break;
					}
					else if (j==ch2.length-1)
					{
						System.out.println("Not Anagrams");
					    System.exit(0);
					}
				}
			  if (i==ch1.length-1)
			  {
				  System.out.println("Anagrams");
			  }
			}
			
		}
		
	  }
 public static void main(String[] args)
	  {
  	//   System.out.println("Enter two Strings");
	   Scanner s=new Scanner(System.in);
	   String s1=s.nextLine();
	   String s2=s.nextLine();
	   while(s1.length()>50 ||s2.length()>50)
	   {
		   System.out.println("Length of input strings should be less than 50");
		   s1=s.nextLine();
		   s2=s.nextLine();
	   }
	   isAnagram(s1,s2);
	  }
 }  