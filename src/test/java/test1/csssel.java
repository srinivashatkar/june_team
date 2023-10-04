package test1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class csssel {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.findElement(By.id("name")).sendKeys("sandhya");
       Thread.sleep(2000);
       driver.findElement(By.id("email")).sendKeys("sandhyasree132@gmail.com");
       Thread.sleep(2000);
       driver.findElement(By.id("phone")).sendKeys("765971788");
       Thread.sleep(2000);
       driver.findElement(By.id("textarea")).sendKeys("10-55 gorlavedu");
       Thread.sleep(2000);
       driver.findElement(By.id("female")).click();
       Thread.sleep(2000);
       driver.findElement(By.id("sunday")).click();
    	  Thread.sleep(2000);
    	  driver.findElement(By.id("country")).sendKeys("india");
    	  Thread.sleep(2000);
    	  driver.findElement(By.id("colors")).sendKeys("blue");
    	  Thread.sleep(2000);
    	  driver.findElement(By.id("datepicker")).sendKeys("10 06 1997");
    	  
      }
       
	}


