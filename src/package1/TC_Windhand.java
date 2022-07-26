package package1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_Windhand {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.gecko.firefox", "E:\\DRIVER\\Gecko Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();//
		// 1st window

		driver.get("file:///E:/DRIVER/HTML%20File/multiplewindows.html");
		Thread.sleep(3000);
		// 2nd window
		driver.findElement(By.id("btn2")).click();
		Thread.sleep(3000);
		// 3rd window
		driver.findElement(By.id("btn3")).click();

		ArrayList<String> windsinfo = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windsinfo.get(0));
		Thread.sleep(3000);
		// driver.close();//To close carrent browser
		driver.quit();// To close all browser opend by Webdriver instance

	}

}
