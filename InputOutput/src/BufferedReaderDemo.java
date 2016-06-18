import java.io.*;


public class BufferedReaderDemo 
{
	public static void main(String args[]) throws IOException
	{
InputStreamReader in=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(in);
String name="";
while(!name.equals("stop"))
{
	if (!name.equals("stop"))
	{
System.out.println("enter your name");
name=br.readLine();
System.out.println("Welcome: "+name);
	}
	else
{
System.out.println("stopped");	
}
}
}}