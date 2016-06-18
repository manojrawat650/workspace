
public class ABC {
	int i;
	int j;
	ABC(int a,int b)
	{
		i=a;
		j=b;
	}
	ABC(ABC x)
	{
		i=x.i;    
		j=x.j;
		
	}
   
	public static void main(String[] args)
	{
		ABC ob1=new ABC(10,20);
		System.out.println("i: "+ob1.i+" j: "+ob1.j);
		ABC ob2=new ABC(ob1);   
		System.out.println("i: "+ob2.j+" j: "+ob2.j);

	}

}
