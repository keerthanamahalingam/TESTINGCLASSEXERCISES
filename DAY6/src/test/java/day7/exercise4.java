package day7;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;

public class exercise4 {
  WebDriver driver;
  
  @BeforeSuite
  void init() {
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  driver=new ChromeDriver(co);
  }
@Test
void Test1() throws InterruptedException
{
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	driver.get(url);
	Thread.sleep(3000);
	WebElement uname=driver.findElement(By.name("username"));
	WebElement pwd=driver.findElement(By.name("password"));
	WebElement submit=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	uname.sendKeys("Admin");
	pwd.sendKeys("admin123");
	submit.click();
	String url1="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	String actualurl=driver.getCurrentUrl();
	Assert.assertEquals(url1, actualurl);
}
@Test(dependsOnMethods="Test1")
void Test2() throws InterruptedException
{
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
	Thread.sleep(3000);
	WebElement logout=driver.findElement(By.linkText("Logout"));
	logout.click();
	driver.close();
}

}
