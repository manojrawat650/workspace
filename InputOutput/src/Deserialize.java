import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class Deserialize {
	public static void main(String arg[]) {
		try{
		FileInputStream fin=new FileInputStream("file.txt");
	    ObjectInputStream oin=new ObjectInputStream(fin);
	    Student st1=(Student)oin.readObject();
	    System.out.println(st1.rollno+st1.name+Student.school);
		}catch(Exception e){}
	}}


