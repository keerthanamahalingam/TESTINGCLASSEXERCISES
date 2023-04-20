package day7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class exercise2 {
	int a=12,b=10;
	@Test(priority=3)
	public void add() {
		int c=a+b;
		System.out.println("Addition: "+c);
		Assert.assertEquals(c, 22);
	}
	@Test(priority=2)
	public void sub() {
		int c=a-b;
		System.out.println("Substraction: "+c);
		Assert.assertEquals(c, 2);
	}
	@Test(priority=1)
	public void mul() {
		int c=a*b;
		System.out.println("Multiplication: "+c);
		Assert.assertEquals(c, 120);
	}
	@Test(priority=4)
	
	public void div() {
		int c=a/b;
		System.out.println("Divison: "+c);
		Assert.assertEquals(c, 1);
	}

}