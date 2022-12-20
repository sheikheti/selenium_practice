package com.bd.practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Alerts extends BaseDriver {
	
public static String BaseUrl = "https://the-internet.herokuapp.com/javascript_alerts";
	
	@Test
	public void openUrl() throws InterruptedException {
		
		Driver.get(BaseUrl);
		Driver.manage().window().maximize();
		
		WebElement ClickforJSAlert = Driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		ClickforJSAlert.click();
		Thread.sleep(3000) ;
		String alartmessage = Driver.switchTo().alert().getText();
		System.out.println("message check :"+alartmessage);
		Driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		WebElement ClickforJSConfirm = Driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		ClickforJSConfirm.click();
		Thread.sleep(3000) ;
		Driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		WebElement ClickforJSPrompt = Driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		ClickforJSPrompt.click();
		Thread.sleep(3000) ;
		Driver.switchTo().alert().sendKeys("hello ");
		Thread.sleep(4000);
		Driver.switchTo().alert().accept();
		Thread.sleep(7000);
		
		
		
		
		
		
		
		
		
			
	}

}
