import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       ArrayList ar=new ArrayList(N);
       for (int i=0;i<N;i++)
       {
    	   ar.add(sc.nextInt());
       }
       int Q=sc.nextInt();
       for (int i=0;i<Q;i++)
       {
    	   String a=sc.next();
    	   if (a.equals("Insert"))
    	   {
    		   ar.add(sc.nextInt(),sc.nextInt());
    	   }
    	   else if (a.equals("Delete"))
    	   {
    		   ar.remove(sc.nextInt());
    	   }     
       }
       for (Object o:ar)
       {
    	   System.out.print((Integer)o);
    	   System.out.print(" ");
    	   System.out.println(ar);
       }
       
       
       
	}

}
