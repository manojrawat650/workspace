import java.io.*;  
class ConsoleDemo{  
public static void main(String args[]){  

	try{Console c=System.console();  
System.out.println("Enter your name: ");  
char[] ch=c.readPassword(); 
int i=(int)System.currentTimeMillis();
	}
	catch(Exception e)
	{
		}
	
}  
}  
