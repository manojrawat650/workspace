package print;

import java.util.*;

/*public class Solution
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Set hs=new HashSet();
		ArrayList ar=new ArrayList();
		int t=sc.nextInt();
		String s=null;
		String st[];
		int total=0;
		sc.nextLine();
		for (int i=0;i<t;i++)
		{
			s=sc.nextLine();
			st=s.split(" ");
			
			if (st[0].length()>5 || st[1].length()>5)
			{
				System.exit(0);
			}
			hs.add(s);
			ar.add(hs.size());
		}
		for (int i=0;i<ar.size();i++)
		{
	        System.out.println(ar.get(i));		
		}
   	}
}*/
//Write your code here
class foodFactory {
	public final String getName()
    {
    	return "";
    }
		
    public static Food getFood(String s)
        {
        if (s.equals("Fastfood"))
            {
            return new FastFood();
        }
        else if (s.equals("Fruits"))
            {
            return new Fruits();
        }
		return null;
    }
}

class Food {
     public void serveFood()
        {
        
    }
}
class FastFood extends Food
    {
    public void serveFood()
        {
        System.out.println("I'm serving Fastfood");
    }
    public String getName()
    {
    	return "FastFood";
    }
}
class Fruits extends Food
    {
     public void serveFood()
        {
    System.out.println("I'm serving Fruits");
  }
     public String getName()
     {
     	return "Fruits";
     }
}

class Solution {
	public static void main(String[] argh) {
		foodFactory myFoods = new foodFactory();
		Food food1 = myFoods.getFood("Fastfood");
		Food food2 = myFoods.getFood("Fruits");	
		System.out.println("My name is: " + food1.getClass().getName());
		System.out.println("My name is: " + food2.getClass().getName());
		System.out.println("Our superclass is: " + food1.getClass().getSuperclass().getName());
		food1.serveFood();
		food2.serveFood();
	}
}