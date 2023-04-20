package screen;
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
 
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screen{
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.navigate().to("https://j2store.net/free/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);
		Robot robot=new Robot();
		Dimension scr_size=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect=new Rectangle(scr_size);
		BufferedImage scrshot=robot.createScreenCapture(rect);
		File dest=new File("D://scrsht.png");
		ImageIO.write(scrshot,"png", dest);
		
		
	}
}