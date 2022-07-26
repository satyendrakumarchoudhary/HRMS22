package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC002 {
	public static void main(String args[]) throws Exception {
		// launch browser
		System.setProperty("webdriver.gecko.driver", "E:\\DRIVER\\Gecko Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");

		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");

		// enter into frame
		driver.switchTo().frame("rightMenu");

		// WebElement sp = driver.findElement(By.xpath("//option[@value='0']"));
		// String shiv = sp.getText();
		// System.out.println(shiv);

		String[] obj = new String[9];
		for (int i = 0; i <= 8; i++) {
			if (i == 4)
				continue;
			else if (i == 5)
				continue;
			else
				obj[i] = driver.findElement(By.xpath("//option[@value='" + i + "']")).getText();
		}

		for (int j = 0; j <= 8; j++) {
			if (j == 4)
				continue;
			else if (j == 5)
				continue;
			System.out.println(obj[j]);
		}
		driver.quit();

	}

}
