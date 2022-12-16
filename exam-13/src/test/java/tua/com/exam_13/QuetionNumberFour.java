package tua.com.exam_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class QuetionNumberFour extends BaseDriver {
	
	static String urlLink = "https://the-internet.herokuapp.com/javascript_alerts";
	
	
	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		
		driver.get(urlLink);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void alerts() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
		
		//jsAlert
		WebElement jsAlert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		
		jsAlert.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
		String resultText = result.getText();
		softAssert.assertEquals(resultText, "You successfully clicked an alert");
		
		//jsConfirm
		WebElement jsConfirm= driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		jsConfirm.click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

		String resultTex = result.getText();
		
		System.out.println(resultTex);
		
		softAssert.assertEquals(resultTex, "You clicked: Ok");
		
		Thread.sleep(2000);
		
		//jsPrompt
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		driver.switchTo().alert().sendKeys("Hey Alert");
		driver.switchTo().alert().accept();
		
		String resultJs = result.getText();
		softAssert.assertEquals(resultJs, "You entered: Hey Alert");
		Thread.sleep(2000);
		
		
		
		softAssert.assertAll();
		
	}

}
