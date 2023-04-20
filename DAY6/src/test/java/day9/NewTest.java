package day9;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTest {
	int c;
  @Test(dataProvider = "dp")
  public void Add(Integer n, Integer s) {
	  c=n+s;
	  System.out.println("Addition:"+c);
  }
  @Test(dataProvider = "dp")
  public void Sub(Integer n, Integer s) {
	  c=n-s;
	  System.out.println("Subtraction:"+c);
  }
  @Test(dataProvider = "dp")
  public void Mul(Integer n, Integer s) {
	  c=n*s;
	  System.out.println("Multiplication:"+c);
  }
  @Test(dataProvider = "dp")
  public void Div(Integer n, Integer s) {
	  c=n/s;
	  System.out.println("Division:"+c);
  }
  
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, 7 },
      new Object[] { 2, 9 },
    };
  }
}
