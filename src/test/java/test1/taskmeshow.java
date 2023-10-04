package test1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskmeshow {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("shirts");
		WebElement men =driver.findElement(By.xpath("//input[@type=\"text\"]"));
		men.sendKeys("shirts");
		men.click();
		
		List<WebElement> sndy=driver.findElements(By.xpath("//div[@class='sc-cOxWqc bLdIZq']/p"));
		System.out.println(sndy.size());
		Thread.sleep(2000);
		for(WebElement list:sndy) {
		System.out.println(list.getText());
		if(list.getText().contains(" men"));
    	list.click();
		break;
			
		}
		
	}

}
