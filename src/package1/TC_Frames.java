package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_Frames {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.gecko.driver", "E:\\DRIVER\\Gecko Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		Thread.sleep(4000);
		// Enter into frame
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
		Thread.sleep(4000);
		System.out.println("Clicked on Add button");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("ashok");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("panda");
		driver.findElement(By.id("btnEdit")).click();
		Thread.sleep(4000);
		System.out.println("Added new emp");

		// Exti from frame
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		driver.close();
	}

}
