package test1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File source=ts.getScreenshotAs(OutputType.FILE);
	    File destination=new File("./target/demo.png");
	    FileUtils.copyFile(source, destination);

	}

}
