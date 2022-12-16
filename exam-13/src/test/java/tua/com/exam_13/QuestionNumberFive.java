package tua.com.exam_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class QuestionNumberFive extends BaseDriver{
	
	static String urlLink = "https://www.daraz.com.bd/";
	
	
	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		
		driver.get(urlLink);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void daraz() throws InterruptedException {
		
		Actions action = new Actions(driver);
		
		WebElement motorBike = driver.findElement(By.xpath("//span[contains(text(),'Automotive & Motorbike')]"));
		action.moveToElement(motorBike).perform();
		Thread.sleep(2000);
		
		WebElement ridingGear = driver.findElement(By.xpath("//span[contains(text(),'Motorcycle Riding Gear')]"));
		action.moveToElement(ridingGear).perform();
		Thread.sleep(2000);
		
		WebElement helmet = driver.findElement(By.xpath("//span[contains(text(),'Helmet')]"));
		helmet.click();
		Thread.sleep(3000);
		
		
	}
	
	
	
}
