import java.io.*;


class Student implements Serializable
{
int rollno;
String name;
static String school="KV";
Student(int rollno,String name)
{
	this.rollno=rollno;
	this.name=name;
	
}


}
public class SerializableDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		Student st=new Student(12,"manoj");	
	FileOutputStream fout=new FileOutputStream("file.txt");
	ObjectOutputStream out=new ObjectOutputStream(fout);
	out.writeObject(st);
	}

	

}
