import java.util.*;


class Employee implements Comparable
{
private String name;
private int age;
private String department;
Employee(String name,int age,String department)
{
this.name=name;
this.age=age;
this.department=department;
}
class NameComparator implements Comparator
{
public int compare(Object o1,Object o2)
{
	Employee e1=(Employee)o1;
	Employee e2=(Employee)o2;
	int i=e1.compareTo(e2);
	}

}
}

public class ComparatorDemo {

	public static void main(String[] args)
	{
	Employee e1=new Employee("ajay",23,"ENG");
	Employee e2=new Employee("Vijay",25,"DCX");
    ArrayList<Employee> ar=new ArrayList<Employee>();
    ar.add(e1);
    ar.add(e2);
    Collections.sort(ar);
	}

}
