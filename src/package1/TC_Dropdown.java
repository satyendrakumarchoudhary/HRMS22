package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_Dropdown {
	public static void main(String [] args) throws Exception {
		// Test steps
		System.setProperty("webdriver.gecko.driver","E:\\DRIVER\\Gecko Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();

		Thread.sleep(4000);
		System.out.println("Login completed");
		driver.switchTo().frame("rightMenu");
		Select st = new Select(driver.findElement(By.name("loc_code")));
		st.selectByValue("0");
		Thread.sleep(4000);
		driver.findElement(By.name("loc_name")).sendKeys("0362");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.name("chkLocID[]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();

	}

}
