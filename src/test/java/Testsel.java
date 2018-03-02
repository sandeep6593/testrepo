import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Testsel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver","G:\\geckodriver-v0.10.0-win64\\geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.get("http://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
		  driver.findElement(By.xpath("//*[@id='sandbox-container1']/div/input")).click();
		  WebElement cal=driver.findElement(By.xpath("html/body/div[3]"));
		  String monthAndYear=driver.findElement(By.xpath("html/body/div[3]/div[1]/table/thead/tr[2]/th[2]")).getText();
		  int mlen=monthAndYear.length()-5;
		
		 String month="Mar";
		if(monthAndYear.substring(0,mlen-1).equals(month)){
			 List<WebElement> list=driver.findElements(By.className("day"));
			  for(WebElement li:list){
				  System.out.println(li.getText());
				 if(li.getText().equals("10")){
					  li.click();
					  
				  }
			  }
		}else{
			driver.findElement(By.xpath("html/body/div[3]/div[1]/table/thead/tr[2]/th[2]")).click();
			List<WebElement> list1=driver.findElements(By.className("month"));
			  for(WebElement li1:list1){
				  System.out.println(li1.getText()+ "iss "+month);
				 if(li1.getText().equals(month)){
					 
					  li1.click();
					  List<WebElement> list=driver.findElements(By.className("day"));
					  for(WebElement li:list){
						  System.out.println(li.getText());
						 if(li.getText().equals("10")){
							  li.click();
							  
						  }
					  }
					  break;
			
		}
 
			  }
			  }  
	}

}
