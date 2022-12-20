package com.bd.practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Navigate extends BaseDriver {
	
public static String BaseUrl = "https://the-internet.herokuapp.com/";
	
	@Test
	public void openUrl() throws InterruptedException {
		
		Driver.get(BaseUrl);
		Driver.manage().window().maximize();
		
		WebElement ContextMenu = Driver.findElement(By.xpath("//a[contains(text(),'Context Menu')]"));
		ContextMenu.click();
		Thread.sleep(3000);
		Driver.navigate().back();
		Thread.sleep(4000);
		
		Driver.navigate().forward();
		Thread.sleep(5000);
		
		
		
		
	}

}
