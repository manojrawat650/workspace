package print;
import java.util.*;
public class SumOfTwoNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       sc.nextLine();
       int arr[]=new int[n];
       for (int i=0;i<n;i++)
       {
    	   String st[]=sc.nextLine().split(" ");
    	   arr[i]=Integer.parseInt(st[0])+Integer.parseInt(st[1]);
    	   
       }
       for (int j=0;j<n;j++)
       {
    	   System.out.println(arr[j]);
       }
       sc.close();
	}

}
