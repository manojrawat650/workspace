package java1;

public final class Employee{  
final String pancardNumber;  
  
public Employee(String pancardNumber){  
this.pancardNumber=pancardNumber;  
}  
  
public String getPancardNumber(){  
return pancardNumber;  
}  
  public static void main(String ags[])
  {
	  Employee e=new Employee("abcd101");
	  System.out.println(e.pancardNumber);
  }
}  
