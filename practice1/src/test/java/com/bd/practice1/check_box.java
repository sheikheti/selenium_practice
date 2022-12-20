package com.bd.practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class check_box extends BaseDriver {

public static String BaseUrl = "https://codenboxautomationlab.com/practice/";
	
	@Test
	public void openUrl() throws InterruptedException {
		
		Driver.get(BaseUrl);
		Driver.manage().window().maximize();
		
		WebElement radio1button = Driver.findElement(By.xpath("//input[@value='radio1']"));
		radio1button.click();
		//Thread.sleep(2000) ;
		
		//..............check box..........
		WebElement checkBoxOption1 = Driver.findElement(By.id("checkBoxOption1"));
		checkBoxOption1.click();
		
		WebElement checkBoxOption3 = Driver.findElement(By.id("checkBoxOption3"));
		checkBoxOption3.click();
		Thread.sleep(2000);
		
		
		
		
			
	}

}
