package com.bd.practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Arrong extends BaseDriver  {
	
	
	
	//...............title........................
	
	
	public static String BaseUrl = "https://www.aarong.com/";
	
	public static String expectedtitle = "Aarongggg | Ethically made handcrafted products | A BRAC social enterprise";
	
	
	@Test (priority = 0)
	public void openUrl() {
		
		Driver.get(BaseUrl);
		Driver.manage().window().maximize();
		
		String  actualtitle =Driver.getTitle();
		System.out.println("title"+actualtitle);
		
		if(actualtitle.equals(expectedtitle)) {
			System.out.println("title is match ");
		}else {
			System.out.println("title is not match");
		}
			
	}
	
	@Test  (priority = 1)
	public void test1() throws InterruptedException   {
		
		WebElement tagga = Driver.findElement(By.xpath("//a[@href='https://www.aarong.com/brand/taaga']"));
		tagga.click();
		Thread.sleep(1000);
		
		WebElement find_text = Driver.findElement(By.xpath("//h2[contains(text(),'SIGNATURE DETAILS')]"));
		
		System.out.println(find_text.getText());
		Thread.sleep(2000);
		
		
		
		WebElement link_tagga_man = Driver.findElement(By.xpath("//a[@href='https://www.aarong.com/brand/taaga-man']"));
		link_tagga_man.click();
		
		//WebElement click_search = Driver.findElement(By.className("search-icon"));
		//WebElement click_search = Driver.findElement(By.xpath("//li[@class='search-icon']"));
        
		//........search..........
		WebElement click_search = Driver.findElement(By.xpath("//a[@href='javascript:void(0)']"));
		click_search.click();
		
		//WebElement input_search = Driver.findElement(By.xpath("//input[@id='search']"));
		WebElement input_search = Driver.findElement(By.id("search"));
		input_search.clear();
		input_search.sendKeys("kurti");
		Thread.sleep(1000);
		
		WebElement input_click = Driver.findElement(By.xpath("//button[@class='action search']"));
		input_click.click();
		Thread.sleep(2000);
		
		
		
			
	}
	
	
	

}
