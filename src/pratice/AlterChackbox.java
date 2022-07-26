package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlterChackbox {
	public static void main(String args[]) throws Exception {
		// launch browser
		System.setProperty("webdriver.gecko.driver", "E:\\DRIVER\\Gecko Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// enter url
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		// login
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		// Enter to the frame
		driver.switchTo().frame("rightMenu");
		for (int i = 1; i <= 10; i = i + 2) {

			driver.findElement(By.xpath("/html/body/div/div[2]/form/table/tbody/tr[" + i + "]/td[1]/input")).click();

		}
		// Exit to the frame
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.close();// close carrent browser

	}

}
