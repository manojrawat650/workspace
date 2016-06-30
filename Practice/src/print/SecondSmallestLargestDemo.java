package print;
import java.util.*;
public class SecondSmallestLargestDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
     String st[]=sc.nextLine().split(" ");
     int arr[]=new int[st.length];
     TreeSet ts=new TreeSet();
     for (int i=0;i<st.length;i++)
     {
    	 arr[i]=Integer.parseInt(st[i]);
    	 ts.add(arr[i]);
     }
     ArrayList ar=new ArrayList(ts);
     System.out.println(ar.get(1));
     System.out.println(ar.get(ar.size()-2));
	}

}
