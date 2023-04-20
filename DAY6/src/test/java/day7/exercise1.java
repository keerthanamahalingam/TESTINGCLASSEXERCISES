package day7;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class exercise1{
	@Test
	public void pro1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.navigate().to("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		String expect="Guest Registration Form – User Registration";
	    String actual =driver.getTitle();
	    Assert.assertEquals(expect, actual);
	    System.out.print("true");
	}

}