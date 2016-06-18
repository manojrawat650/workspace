
public class Vehicle {
	int price;
	Vehicle()
	{
		price=20000;
		System.out.println("Constructor of vehicle class");
	}
}
class Car extends Vehicle
{
	int price;
	Car()
	{
		System.out.println("manoj");
	}
    Car(int price)
    { 
    	System.out.println("Constructor of bike class");
	    this.price=price;
	    System.out.println("price of car is: "+this.price);
    }
    public static void main(String args[])
    {
    	Car c=new Car(30000);
    }
    
}

