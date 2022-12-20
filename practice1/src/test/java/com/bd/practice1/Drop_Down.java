package com.bd.practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Drop_Down extends BaseDriver {
	
public static String BaseUrl = "https://qavbox.github.io/demo/signup/";
	
	@Test
	public void openUrl() throws InterruptedException {
		
		Driver.get(BaseUrl);
		Driver.manage().window().maximize();
		
		WebElement select = Driver.findElement(By.xpath("//select[@name='sgenderr']"));
		select.click();
		Thread.sleep(3000);
		Select genderselect = new Select(select);
		
		//.......selectby value , index, visible test
		
		// .......value ........
		//genderselect.selectByValue("na");
		//genderselect.selectByValue("female");
		
		//.......visible test........
		//genderselect.selectByVisibleText("Male");
		
		
		//.......index........
		genderselect.selectByIndex(3);
		
		
		Thread.sleep(7000);
		
		
//		WebElement radio2 = Driver.findElement(By.xpath("//input[@value='two']"));
//		radio2.click();
//		Thread.sleep(10000);
		
		
		
		
		
		
		
		
		
	}

}
