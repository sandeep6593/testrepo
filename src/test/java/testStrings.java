import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testStrings {

	public static void main(String[] args) throws IOException, AWTException {

/* File file=new File("D:\\testrals.txt");
 file.createNewFile();*/
		
/*	FileWriter fw=new FileWriter("D:\\testrals.txt");
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write("Hello");
	bw.newLine();
	bw.write("testdata");
	bw.flush();
	bw.close();*/
		
		/*FileReader fr=new FileReader("D:\\testrals.txt");
		BufferedReader bfr=new BufferedReader(fr);
		
		String tesst=bfr.readLine();
		System.out.println(tesst);
		System.out.println(bfr.lines());*/
		String test=" Hello Sandeep";
		System.out.println("Index of e is "+test.indexOf("e"));
		System.out.println(test.replace("e","w"));
		System.out.println(test.length());
		System.out.println(test.trim().length());
		System.out.println(test.substring(2,5));
		System.out.println(test.charAt(4));
 System.out.println(test.trim().equalsIgnoreCase("Hellou Sandeep"));
		System.out.println(test.endsWith("p"));
		String[] it=test.split("e");
		int y=it.length-1;
		for(int i=0;i<=y;i++){
			System.out.println(it[i]);
				
		}
		
	
		System.setProperty("webdriver.gecko.driver","G:\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.get("http://www.facebook.com");
		  //driver.findElement(By.id("email")).sendKeys("test");
		  Robot r=new Robot();
		  r.mousePress(InputEvent.BUTTON3_DOWN_MASK);
		  r.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
		  System.out.println(MouseInfo.getPointerInfo());
		  System.out.println(MouseInfo.getPointerInfo().getLocation());

	}

}
