package java1;

public class Student {
	
	String name;
	int rollno;
	int id;

	Student(String name,int rollno,int id)
	{
this.name=name;
this.rollno=rollno;
this.id=id;
	}
	public static void main(String[] args) 
	{
		Student st1=new Student("manoj",10,656081);
		Student st2=new Student("gaurav",12,656980);
		
	    System.out.println("Details of student 1: "+st1.name+" "+st1.rollno+" "+st1.id);
		System.out.println("Details of student 2:"+st2.name+" "+st2.rollno+" "+st2.id);
	}

}
