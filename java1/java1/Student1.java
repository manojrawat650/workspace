package java1;

public class Student1 {

	String name;
	int id;
	
	public void setInfo(String n,int i)
	{
		name=n;
		id=i;
	}
	public void getInfo()
	{
	    System.out.println(name);
	    System.out.println(id);
	}
	public String display()
	{
		return "the details of the student:";
	}
	public static void main(String[] args) 
	{
		Student1 st=new Student1();
		st.setInfo("manoj",656081);
	System.out.println(st.display());
		st.getInfo();
		

	}

}
   