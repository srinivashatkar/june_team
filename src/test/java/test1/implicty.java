package test1;

import java.time.Duration;

import javax.lang.model.element.Element;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.WaitStrategy;

public class implicty {

	public static void main(String[] args) throws Throwable {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 WebDriverWait waits=new WebDriverWait(driver,Duration.ofSeconds(15));
	 driver.findElement(By.id("alert")).click();
	 Alert Element= waits.until(ExpectedConditions.alertIsPresent());
	 driver.switchTo().alert().accept();
	 Thread.sleep(2000);
	 driver.findElement(By.id("populate-text")).click();
	 WebElement h2=driver.findElement(By.id("h2"));
	 waits.until(ExpectedConditions.elementToBeClickable(h2));
	 System.out.println(h2.isDisplayed());
	 Thread.sleep(2000);
	 driver.findElement(By.id("display-other-button")).click();
	 WebElement hden=driver.findElement(By.id("hidden"));
	 waits.until(ExpectedConditions.elementToBeClickable(hden));
	 System.out.println(hden.isDisplayed());
	 Thread.sleep(2000);
	driver.findElement(By.id("enable-button")).click();
	 WebElement dis=driver.findElement(By.id("disable"));
	 waits.until(ExpectedConditions.elementToBeClickable(dis));
	 System.out.println(dis.isDisplayed());
	 Thread.sleep(2000);
	 driver.findElement(By.id("checkbox")).click();
	 WebElement ch=driver.findElement(By.id("ch"));
	 waits.until(ExpectedConditions.elementToBeClickable(ch));
	 System.out.println(ch.isSelected());
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

	}

}
