import java.util.Scanner;



public class RegexDemo
{

    public static void main(String[] args) {
    	int sum=0;
    	 Scanner s=new Scanner(System.in);
    	 int n=s.nextInt();
  	   s.nextLine();
	   String s1=s.nextLine();
	   String s2[]=s1.split("\\s");
	   for (int i=0;i<n;i++)
	   {
		   sum=sum+Integer.parseInt(s2[i]);
	   }
	   System.out.println(sum);
    }
}
