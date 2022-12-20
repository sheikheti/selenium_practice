package com.bd.practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class hover extends BaseDriver {
	
public static String BaseUrl = "https://demoqa.com/menu";
	
	@Test
	public void openUrl() throws InterruptedException {
		
		Driver.get(BaseUrl);
		Driver.manage().window().maximize();
		
		Actions actions = new Actions(Driver);
		
		WebElement Main_Menu = Driver.findElement(By.xpath("//a[contains(text(),'Main Item 2')]"));
		actions.moveToElement(Main_Menu).perform();
		Thread.sleep(3000);
		
		WebElement Sub_Menu = Driver.findElement(By.xpath("//a[contains(text(),'SUB SUB LIST »')]"));
		actions.moveToElement(Sub_Menu).perform();
		Thread.sleep(3000);
		
		
		WebElement Sub_item = Driver.findElement(By.xpath("//a[contains(text(),'Sub Sub Item 2')]"));
		actions.moveToElement(Sub_item).perform();
		Thread.sleep(5000);
		
		
		
		
	}

}
