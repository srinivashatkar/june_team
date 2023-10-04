package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tests {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
	   driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://poojastore.marolix.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
@Test
public void test() {
	
	driver.findElement(By.xpath("//a[text()='Log In']")).click();	
}
@Test
	public void test2() {
		driver.findElement(By.xpath("//a[text()='Log In']")).click();	
		driver.findElement(By.name("emailid")).sendKeys("srinivas11@gamil.com");
		driver.findElement(By.name("pword")).sendKeys("1234");
	}

	
	
	
	
	
	
}
