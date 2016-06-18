package ArrayList;

import java.util.*;

class Student
{
int rollno;
String name;
int age;
Student(int rollno,String name,int age)
  {
	this.rollno=rollno;
	this.name=name;
	this.age=age;
  }
}

public class Test2 {
	

	public static void main(String[] args) {
		Student st1=new Student(21,"Manoj",25);
		Student st2=new Student(22,"Gaurav",26);
		Student st3=new Student(23,"Kapil",24);
		
		ArrayList ar=new ArrayList();
		ar.add(st1);
		ar.add(st2);
		ar.add(st3);
		Iterator itr=ar.iterator();
		while(itr.hasNext())
		{
			Student st=(Student)itr.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}

	}

}
