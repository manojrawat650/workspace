package print;
import java.util.*;
public class Demo1 {

public static void main(String[] args)
    {
int mymarks[]=new int[]{1,2,3};
printMarks(mymarks);
    }

public static void printMarks(int[] mymarks) {
	for (int mark1:mymarks)
	{
	System.out.println(mark1);	
	}
}	
}
