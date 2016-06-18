package java2;

public class main {
	int a;
static
 {
	System.out.println("static is called");
 }
main()
 {
    System.out.println("constructor is called");	
 }
main(int a)
{
	this.a=a;
   	System.out.println(a);
}
public static void main(String args[])
 {
	main m=new main(10);
 }
}
