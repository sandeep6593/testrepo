import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoItupload {

	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.gecko.driver","G:\\geckodriver-v0.10.0-win64\\geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.get("http://toolsqa.com/automation-practice-form/");
		  //driver.findElement(By.xpath(".//*[@id='photo']")).click();
		  //Runtime.getRuntime().exec("G:\\autiitupload.exe");
		 // Runtime.getRuntime().exec("G:\\autiitupload.exe"+" "+"G:\\1.png");
		  WebElement coreJava=driver.findElement(By.xpath("//*[@id='text-15']/div[2]/b[10]/a"));
		  Util.isElementPresnt(driver,"//*[@id='text-15']/div[2]/b[10]/a",10).click();
		/* JavascriptExecutor execute=(JavascriptExecutor)driver;
		 execute.executeScript("arguments[0].scrollIntoView(true);",coreJava);
		  coreJava.click();*/
		 // execute.executeScript("scroll(0,500)");
		  
	}

}
