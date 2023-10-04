package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import io.opentelemetry.sdk.internal.JavaVersionSpecific;

public class Basic {

	public static void main(String[] args) throws Throwable {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	 driver.manage().window().maximize();
      JavascriptExecutor js=(JavascriptExecutor)driver;
      js.executeScript("window.scrollBy(0,250)");
	 driver.findElement(By.id("newWindowBtn")).click();
	 Thread.sleep(2000);
	// driver.close();
     // driver.quit();
	}

}
