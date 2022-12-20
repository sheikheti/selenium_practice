package com.bd.practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class table extends BaseDriver {
	

public static String BaseUrl = "https://testautomationpractice.blogspot.com/";
	
	@Test
	public void openUrl() throws InterruptedException {
		
		Driver.get(BaseUrl);
		Driver.manage().window().maximize();
		
		Actions action = new Actions (Driver);
		
	    WebElement table_movetoelement = Driver.findElement(By.xpath("//table[@name='BookTable']"));
	    action.moveToElement(table_movetoelement).perform();
		Thread.sleep(3000);
		
//		table row
		List<WebElement> table_row = Driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		System.out.println( "size "+table_row.size());
		
		//table data:
		List<WebElement> table_data = Driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[2]/td"));
		System.out.println( "table data: "+table_data.size());
		
		
//		WebElement just_2_row_table_data = Driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[2]"));
//		System.out.println( "just_2_row_table_data: "+just_2_row_table_data.getText());
		
		
		//table of header
		List <WebElement> allHeadersOfTable = Driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
		System.out.println( "table of header : "+allHeadersOfTable.size());
		
		for(WebElement header:allHeadersOfTable) {
			System.out.print( header.getText()+ " | ");
			
		}
		System.out.println();
		
		for (int r=2 ; r <= table_row.size() ; r++) {
			
			WebElement row = Driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td"));
			//System.out.println( row.getText()) ;
			
			
			for(int d=1 ; d<= table_data.size(); d++) {
				
				WebElement allDataofTable = Driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td["+d+"]"));
				System.out.print( allDataofTable.getText()+ " | ");
			}
			System.out.println();
		}
	}
	}
		
	
		
		
		
		
		
		
		
		
		

