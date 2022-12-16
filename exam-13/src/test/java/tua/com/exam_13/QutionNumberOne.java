package tua.com.exam_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class QutionNumberOne extends BaseDriver {
	
	static String urlLink = "https://itera-qa.azurewebsites.net/home/automation";
	
	
	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		
		driver.get(urlLink);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	
	@Test(priority = 1)
	public void giveInput() throws InterruptedException {
		
		WebElement nameInput = driver.findElement(By.xpath("//input[@id='name']"));
		nameInput.sendKeys("Mirajul Islam");
		Thread.sleep(2000);
		
		WebElement mobileNumber = driver.findElement(By.xpath("//input[@id='phone']"));
		mobileNumber.sendKeys("01685045295");
		Thread.sleep(2000);
		
		WebElement emailAdd = driver.findElement(By.xpath("//input[@id='email']"));
		emailAdd.sendKeys("mirazuli345@gmail.com");
		Thread.sleep(2000);
		
		WebElement passWord = driver.findElement(By.xpath("//input[@id='password']"));
		passWord.sendKeys("123456");
		Thread.sleep(2000);
		
		WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
		address.sendKeys("Kashimpur,Gazipur,Dhaka,Bangladesh");
		Thread.sleep(2000);
		
		WebElement submitBtn = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
		submitBtn.click();
	}

}
