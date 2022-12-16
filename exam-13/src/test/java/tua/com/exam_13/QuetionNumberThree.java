package tua.com.exam_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class QuetionNumberThree extends BaseDriver {
	
static String urlLink = "https://itera-qa.azurewebsites.net/home/automation";
	
	
	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		
		driver.get(urlLink);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void boxBtn() throws InterruptedException {
		
		WebElement radioBtn = driver.findElement(By.xpath("//input[@id='male']"));
		radioBtn.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='tuesday']")).click();
		driver.findElement(By.xpath("//input[@id='friday']")).click();
		
		Thread.sleep(2000);
		
	}
	

}
