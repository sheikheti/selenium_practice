package com.bd.practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Iframe extends BaseDriver {
	
public static String BaseUrl = "https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html";
	
	@Test
	public void openUrl() throws InterruptedException {
		
		Driver.get(BaseUrl);
		Driver.manage().window().maximize();
		
		
		List<WebElement> iframe_count = Driver.findElements(By.tagName("iframe"));
		System.out.println("iframe size "+iframe_count.size());
		
		Driver.switchTo().frame("packageListFrame");
		WebElement first_iframe_text = Driver.findElement(By.xpath("//body/main[1]/ul[1]/li[1]/a[1]"));
		first_iframe_text.click();
		Thread.sleep(3000);
		Driver.switchTo().parentFrame();
		
		
		//Driver.navigate().back();
		//Thread.sleep(4000);
		
		Driver.switchTo().frame("packageFrame");
	    WebElement second_iframe_text = Driver.findElement(By.xpath("//span[contains(text(),'Alert')]"));
		second_iframe_text.click();
		Thread.sleep(3000);
	
		
		
		
		
		
	}

}
