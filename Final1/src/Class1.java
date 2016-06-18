
public class Class1 {
   static final int i;
   static
   {
	   i=10;
	   System.out.println("asdf");
   }
   
   Class1()
   {
	   
   }
   Class1(int j)
   {
	  
   }
   
	public static void main(String[] args) {
      
     Class1 ob=new Class1();
    System.out.println("value of i: "+ob.i);
    Class1 ob1=new Class1(15);
    System.out.println("value of i: "+ob1.i);
	}

}
