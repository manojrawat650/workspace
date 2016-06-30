package print;

import static org.junit.Assert.*;    

import org.junit.*;
import org.junit.Test;

public class JunitDemo
{	
	@Test()
	public void testFindMax()
	{
	assertEquals(3,Calculation.findMax(new int[]{1,2,3}));	
	}

	@Before
	public void method()
	{
		System.out.println("running before every method");
	}
}
