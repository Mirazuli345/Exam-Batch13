package tua.com.exam_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class QuetionNumberTwo extends BaseDriver {
	
	static String urlLink = "https://itera-qa.azurewebsites.net/home/automation";
	
	
	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		
		driver.get(urlLink);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void dropDown() throws InterruptedException {
		
		WebElement dropDown = driver.findElement(By.xpath("//select[@class='custom-select']"));
		
		Select select = new Select(dropDown);
		
		select.selectByIndex(1);
		Thread.sleep(2000);
		
		
		
	}

}
