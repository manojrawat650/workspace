import java.io.*;
public class Serializable1Demo implements Serializable{
   String name;
   int num;
   static int i=10;
 
	public static void main(String[] args) 
	{
		Serializable1Demo s=new Serializable1Demo();
		try{
	FileOutputStream fout=new FileOutputStream("file.txt");	
	ObjectOutputStream out=new ObjectOutputStream(fout);
	out.writeObject(s);
	FileInputStream fin=new FileInputStream("file.txt");
	ObjectInputStream oin=new ObjectInputStream(fin);
	Serializable1Demo sd=(Serializable1Demo)oin.readObject();
	System.out.println(sd.name);
	System.out.println(sd.num);
	System.out.println(sd.i);
	       }
		catch(Exception e)
		{
			
		}

	}

}
