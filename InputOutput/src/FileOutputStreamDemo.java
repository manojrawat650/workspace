import java.io.*;


public class FileOutputStreamDemo {

	public static void main(String[] args) {
	   try{ FileOutputStream f=new FileOutputStream("D:/manoj.txt");
	    String s="manoj singh works in infosys";
	    byte b[]=s.getBytes();
	    FileInputStream fin=new FileInputStream("D:/manoj.txt");
	    for (int i=0;i<1;i++)
	    {
             f.write(b);
             
             f.close();
	    }   
             System.out.println("success comes");
             int i=0;
             while( (i=fin.read())!=-1)
             {
            	 System.out.print((char)i);
             }
            
             }
	   catch(Exception e)
	   {
		   
	   }
	}

}
