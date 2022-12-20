package com.bd.practice1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class moveToElement extends BaseDriver {
	

public static String BaseUrl = "https://www.amazon.in/";
	
	@Test
	public void openUrl() throws InterruptedException {
		
		Driver.get(BaseUrl);
		Driver.manage().window().maximize();
		
		Actions action = new Actions (Driver);
	   
		WebElement moveToElement_check = Driver.findElement(By.xpath("//a[contains(text(),'100% Purchase Protection')]"));
		
		action.moveToElement(moveToElement_check).perform();
        Thread.sleep(8000);
	    
	}
}

	 
	

		
	
		
		
		
		
		
		
		
		
		
	
