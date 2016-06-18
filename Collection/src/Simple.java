import java.util.*;  
import java.io.*;  


class Student implements Comparable
{
 String name;
 int marks;
 int age;
 Student(String name,int marks,int age)
 {
	 this.name=name;
	 this.marks=marks;
	 this.age=age;
 }
public int compareTo(Object obj)
{
	Student s=(Student)obj;
	if (age==s.age)
	    return 0;
	else if(age<s.age)
		return -1;
	else 
		return 1;
}

}

public class Simple
{
public static void main(String args[])
{
   ArrayList ar=new ArrayList();	
      ar.add(new Student("manoj",90,11));
      ar.add(new Student("kapil",80,12));
      ar.add(new Student("gaurav",70,13));
      Collections.sort(ar);
      Iterator it=ar.iterator();
      while (it.hasNext())
      {
    	  Student st=(Student)it.next();
    	  System.out.println(st.name+" "+st.marks+" "+st.age);
      }
      
}
}

