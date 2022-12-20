package com.bd.practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class scrolling extends BaseDriver {

public static String BaseUrl = "https://codenboxautomationlab.com/practice/";
	
	@Test
	public void openUrl() throws InterruptedException {
		
		Driver.get(BaseUrl);
		Driver.manage().window().maximize();
		
//		WebElement radio1button = Driver.findElement(By.xpath("//input[@value='radio1']"));
//		radio1button.click();
		//Thread.sleep(2000) ;
		
		JavascriptExecutor js = (JavascriptExecutor)Driver;
		js.executeScript("window.scrollBy(0,1500);");
		Thread.sleep(5000) ;
		
	
		
		
		
		
			
	}

}
