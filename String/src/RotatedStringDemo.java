
public class RotatedStringDemo 
{
	public void isRotatedString(String st)
	{
		 char ch1[]={'s','t','r','i','n','g'};
		  String st1=st;
		  
		  for (int i=0;i<ch1.length-1;i++)
		{
			char temp=ch1[0];
			for (int j=0;j<ch1.length-1;j++)
			{   
				ch1[j]=ch1[j+1];
				
			}
			ch1[ch1.length-1]=temp;
			String st2=new String(ch1);
			if (st2.equals(st1))
			{
				System.out.println("this is a rotated String");
				break;
			}
			
			else if(i==ch1.length-2)
			{
				System.out.println("not a rotated string");
			}
		}
     
	}

	public static void main(String[] args) 
	 {
		 RotatedStringDemo obj=new RotatedStringDemo();
		            obj.isRotatedString("ringst");
		            obj.isRotatedString("string");
	 }

}
