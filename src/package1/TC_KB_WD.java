package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_KB_WD {
	public static void main(String args[]) throws Exception {
		// Test steps
		System.setProperty("webdriver.gecko.driver", "E:\\DRIVER\\Gecko Driver\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		driver1.navigate().to("");
		Thread.sleep(3000);
		driver1.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(3000);
		driver1.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		driver1.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		driver1.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver1.close();

	}

}
