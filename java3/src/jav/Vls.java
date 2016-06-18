package jav;

import java3.ABC;

public class Vls extends ABC{
	public void met()
	{
		display();
		deploy();
		diploma();
		new ABC().display();
		new Vls().deploy();
		new ABC().diploma();
		
	}
	

	public static void main(String[] args) {
		new ABC().display();
		new Vls().deploy();
		new ABC().diploma();
	}

}
