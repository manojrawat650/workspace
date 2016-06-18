package java1;

class manoj{  
	static int i=10;
	int j=1;
	  static{
		  i=9;
		  System.out.println("static block is invoked");}  
}  class ABC
	  {
	  public static void main(String args[]){ 
		  manoj m=new manoj();
	   System.out.println("Hello main");  
	  } } 
	