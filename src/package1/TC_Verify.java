package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_Verify {
	static String url = "http://183.82.103.245/nareshit/login.php";
	static String username = "nareshit";
	static String password = "nareshit";
	static String title1 = "OrangeHRM-New Lavel of HR Management";

	static String title2 = "OrangeHRM";

	public static void main(String args[]) throws Exception {
		// Test Data: DT&Var
		// DT VAR VV
		System.setProperty("webdriver.gecko.driver", "E:\\DRIVER\\Gecko Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to(url);
		// verify title
		// actual result compare expected result
		if (driver.getTitle().equals(title1)) {
			System.out.println("Title matched");
		} else {
			System.out.println("Title not matched ");
			System.out.println(driver.getTitle());
		}
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		Thread.sleep(3000);
		if (driver.getTitle().equals(title2)) {
			System.out.println("Title matched");
		} else {
			System.out.println("Title not matched");
			System.out.println(driver.getTitle());
		}
		// mouseover
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		System.out.println("Mouseover completed");
		Thread.sleep(3000);
		// click on submenu
		driver.findElement(By.linkText("Add Employee")).click();
		System.out.println("Logout completed");
		driver.close();
//28jun2022
	}

}
