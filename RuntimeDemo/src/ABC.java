import java.io.*;
public class ABC {

	public static void main(String[] args) throws IOException {
		Runtime r=Runtime.getRuntime();
		System.out.println(r.totalMemory());
		int j[]=new int[10000];
		for(int i=0;i<10000;i++)
		{
		 j[i]=i;
		}
		System.out.println(r.freeMemory());
		r.gc();
		System.out.println("Garbage collector invoked");
		System.out.println(r.totalMemory());
		System.out.println("free memory after garbage collection"+r.freeMemory());
      
    	  r.exec("notepad");
    	  err();
    	  System.out.println("fgh");
    	
	}

public static void err() throws IOException
{
	throw new IOException();
	}
}

/* the throws keyword is telling the compiler that the statement may throw an exception.
    	  It is not necessary that the statement is throwing exception .
    	  It can either throw an exception or not throw an exception. 
    	  For such statements the compiler forces us to use throws statement in the method signature. 
    	  If the statement throws the exception then we have to handle it so that the rest of the code can execute .
    	  But if it is not throwing an exception then that statement and the rest of the code will work properly.
	*/

