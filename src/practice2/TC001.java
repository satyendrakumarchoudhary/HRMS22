package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC001 {
	public static void main(String args[]) throws Exception {
		// Launch browser
		System.setProperty("webdriver.gecko.driver", "E:\\DRIVER\\Gecko Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// Enter url
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(3000);
		// Login
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		Thread.sleep(3000);
		// Enter into frame
		driver.switchTo().frame("rightMenu");
		Thread.sleep(3000);
		// For loop
		for (int i = 1; i <= 20; i = i + 2) {
			driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr[" + i + "]/td[1]/input")).click();
			System.out.println("clicked on chackbox of" + i);
		}
		// Exit into frame
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		// Logout
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();

	}

}
