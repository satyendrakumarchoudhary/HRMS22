package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "E:\\DRIVER\\Gecko Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nareshit");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(5000);
		driver.switchTo().frame("tightMenu");
		driver.findElement(By.xpath("//input[@value='add']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='txtEmpLastName']")).sendKeys("last name");
		driver.findElement(By.xpath("//*[@name='txtEmpFirstName']")).sendKeys("first name");
		// to upload a file
		WebElement fileinput = driver.findElement(By.xpath("//input[@type='file'][@name='photofile']"));
		fileinput.sendKeys("C:\\Users\\satye\\Pictures\\Screenshots\\Screenshot (110)");
		//// fileInput.sendKeys("G:\\06.TestingTools\\1.0.ProjectName\\Templates\\Defect
		//// Template.xlsx")

		Thread.sleep(7000);
		System.out.println("File uploaded successfully");
		driver.findElement(By.xpath("//*[@id='btnEdit']")).click();

		Thread.sleep(9000);
		System.out.println("New Employee Added");
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();

	}

}
