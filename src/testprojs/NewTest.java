package testprojs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver","G:\\geckodriver-v0.10.0-win64\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://www.facebook.com");
  }

  @AfterTest
  public void afterTest() {
  }

}
