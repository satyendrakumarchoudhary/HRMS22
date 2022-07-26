package pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC003 {
	public static void main (String args []) {
		// Launch browser
		System.setProperty("webdriver.gecko.driver", "E:\\DRIVER\\Gecko Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.google.co.in/");
		String[] ad = new String[60];
		
	  List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	  
	  for (WebElement link:allLinks)
		  System.out.println(link.getAttribute("href"));
	  
	  driver.close();
	  
	  
	}

}
