package com.bd.practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {
	
	public static WebDriver Driver;
	@BeforeSuite
	public void start() {
		
		  String browser= System.getProperty("browser" ,"chrome");
		  
		  if(browser.contains("chrome")) {
			  
			  WebDriverManager.chromedriver().setup();
			  Driver = new ChromeDriver();
		  
		  }else if (browser.contains("opera")) {
			  
			  WebDriverManager.operadriver().setup();
			  Driver = new OperaDriver();
		  
		  }else if (browser.contains("firefox")) {
			  
			  WebDriverManager.firefoxdriver().setup();
			  Driver = new FirefoxDriver();
			  
		  }else {
			  
			  WebDriverManager.edgedriver().setup();
			  Driver = new EdgeDriver();
		  }
	
		
	      // WebDriverManager.chromedriver().setup();
	      // Driver = new ChromeDriver();
	}
	      @AfterSuite
	      public void close() {
		  Driver.quit();
	      //Driver.close();
		 
		}
	
	
	 

}  

