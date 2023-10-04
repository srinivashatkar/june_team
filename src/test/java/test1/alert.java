package test1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alert {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']")).click();
		//driver.findElement(By.xpath("//button[@onclick='myFunctionConfirm()']")).click();
		//driver.findElement(By.xpath("//button[@onclick='myFunctionPrompt()']")).click();
		driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']")).click();
		Thread.sleep(3000);
	//	driver.switchTo().alert().accept();
	//	driver.switchTo().alert().dismiss();
	//	Alert alt=driver.switchTo().alert();
	   //alt.dismiss();
      Alert	alt =driver.switchTo().alert();
		alt.sendKeys("sandhya");
		
		
		
		
		
		
		
		
		
		
	}
	

}
