import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test {
	@org.testng.annotations.Test(retryAnalyzer=Retry.class)
	 
	public void verify() throws AWTException{
	System.setProperty("webdriver.gecko.driver","G:\\geckodriver-v0.17.0-win64\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://www.facebook.com");
	  //driver.findElement(By.id("email")).sendKeys("test");
	  Robot r=new Robot();
	  r.mousePress(InputEvent.BUTTON3_DOWN_MASK);
	  r.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
	 
	}
}
