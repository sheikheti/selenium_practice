package com.bd.practice1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class visibility_check extends BaseDriver {
	

public static String BaseUrl = "https://translate.google.com/?sl=en&tl=bn&op=translate";
	
	@Test
	public void openUrl() throws InterruptedException {
		
		Driver.get(BaseUrl);
		Driver.manage().window().maximize();
		
		Actions action = new Actions (Driver);
	   
		WebElement visibility_check = Driver.findElement(By.xpath("//a[@id='sdgBod']"));
		
		Assert.assertTrue(visibility_check.isDisplayed());
		action.moveToElement(visibility_check).perform();
//		
//		
//	    Thread.sleep(3000);
		// 2 vabe kora jay 
//		if (visibility_check.isDisplayed()) {
//			
//			action.moveToElement(visibility_check).perform();
//		} else {
//			
//			System.out.println("location is not locatable");
//		}
	    
		
	 
	}
}

	 
	

		
	
		
		
		
		
		
		
		
		
		
	
