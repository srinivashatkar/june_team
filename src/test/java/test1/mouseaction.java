package test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseaction {
	

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	WebElement	doubles=driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
	Actions ac=new Actions(driver);
	ac.doubleClick(doubles).build().perform();
	Thread.sleep(3000);
	 WebElement soruce =driver.findElement(By.id("draggable"));
    WebElement destination	= driver.findElement(By.id("droppable"));
	Actions act=new Actions(driver);
	ac.dragAndDrop(soruce, destination).perform();
	Thread.sleep(3000);
	WebElement rightclick =driver.findElement(By.id("name"));
	Actions actn=new Actions(driver);
	actn.contextClick(rightclick).perform();
	
	
	
	
		

	}

}
