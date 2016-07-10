import java.util.*;
public class JumpDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       sc.nextLine();
       String output[]=new String[N]; 
       for (int i=0;i<N;i++)
       {
    	   String st1[]=sc.nextLine().split(" ");
           int n=Integer.parseInt(st1[0]);
           int m=Integer.parseInt(st1[1]);
           String st2[]=sc.nextLine().split(" ");
           int arr[]=new int[st2.length];
    	   for (int j=0;j<st2.length;j++)
    	   {
    		arr[j]=Integer.parseInt(st2[j]);
    	   }
    	   for (int j=0;j<st2.length;j++)
    	   {
    		   if (j+m>n-1)
    		   {
    			   output[i]="YES";
    			   break;
    		   }
    		   else if (arr[j+m]==0)
    		   {
    		      j=j+m-1;	   
    		   }
    		   else if (arr[j+1]==0)
    		   {
    			   
    		   }
    		   else
    		   {
    			   output[i]="NO";
    			   break;
    		   }
    	   }
       }
       for (int i=0;i<N;i++)
       {
    	   System.out.println(output[i]);
       }
	}

}
