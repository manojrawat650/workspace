package ArrayList;

import java.util.*;

class Students
{
 String name;
int rollno;
int marks;
Students(String name,int rollno,int marks)
{
this.name=name;
this.rollno=rollno;
this.marks=marks;
}
}
public class StudentExample {

	public static void main(String[] args) {
		Students s1=new Students("ravi",12,400);
        Students s2=new Students("rahul",15,450);
        
        ArrayList<Students> ar=new ArrayList<Students>();
            ar.add(s1);
            ar.add(s2);
            System.out.println(ar);
            
            Iterator it=ar.iterator();
            while (it.hasNext())
            {
              Students s=(Students)it.next();
              System.out.println(s.name+" "+s.rollno+" "+s.marks);  
            }
	}

}
