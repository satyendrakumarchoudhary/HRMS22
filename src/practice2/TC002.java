package practice2;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC002 {
	public static void main(String args[]) throws Exception {
		// Launch Broswser
		System.setProperty("webdriver.gecko.driver", "E:\\DRIVER\\Gecko Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// Enter url
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		// Login
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		System.out.println(driver.getTitle());
		// Enter into frame
		driver.switchTo().frame("rightMenu");
		Select st = new Select(driver.findElement(By.name("loc_code")));

		List<WebElement> drpval = st.getOptions();
		for (WebElement val : drpval) {
			System.out.println(val.getText());

		}
		// Exit to frame
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();

	}


	}

