
public class Super implements Cloneable
{ 
	int a;
	String s;
   Super(int a,String s)
   {
	   this.a=a;
	   this.s=s;
   }
	public static void main(String[] args) throws CloneNotSupportedException
	{
		try{
     Super s1=new Super(10,"manoj");		
    Super s2=(Super)s1.clone();
    System.out.println("object 1: "+s1);
    System.out.println("Value of s1: "+s1.a+" "+s1.s);
    System.out.println("object 1: "+s2);
    System.out.println("Value of s2: "+s2.a+" "+s2.s);
    Integer i=new Integer("sdf");
    System.out.println(i);
    }
		catch(Exception e)
		{   
			
		}
	}

}

