package test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement dropdown =driver.findElement(By.id("searchDropdownBox"));
		//Select sel =new Select(dropdown);
		Select sel=new Select(dropdown);
	//	sel.selectByVisibleText("Baby");
      // sel.selectByValue("search-alias=collectibles");
		sel.selectByIndex(3);
		
		
		
	}
	

}
