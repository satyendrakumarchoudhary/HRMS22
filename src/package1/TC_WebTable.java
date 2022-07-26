package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_WebTable {
	public static void main (String args [])throws Exception {
		System.setProperty("webdriver.gecko.driver", "E:\\DRIVER\\Gecko Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///E:/DRIVER/WebTable/WebTable.html");
		//count
		int row= driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr")).size();
		System.out.println(row);
		int col=driver.findElements(By.xpath("//*[@id='Course']/tbody/tr[1]/td")).size();
		System.out.println(col);
		int row_col=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size();
		System.out.println(row_col);
		// data cell
	String celldata=driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr[2]/td[2]")).getText();
		System.out.println(celldata);
		//data table
		// DT var VV
		for(int i=1;i<=row;i++) {
			String data=driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr/["+i+"]")).getText();
			Thread.sleep(3000);
			System.out.println(data);
		}
		driver.close();
		
		

		}
	///html/body/table/tbody/tr[2]
}


