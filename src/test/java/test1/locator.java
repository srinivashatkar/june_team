package test1;

import java.time.Duration;
import java.util.List;

import javax.swing.text.html.HTML.Tag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//List<WebElement> tags =driver.findElements(By.tagName("div"));
		//System.out.println(tags.size());
		//for(WebElement tag:tags) {
			//System.out.println(tag.getText());
		driver.findElement(By.id("name")).sendKeys("sandhya");
	//	}
		

	}

}
