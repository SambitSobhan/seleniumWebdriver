package com.webdrivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class hyperlink {
	@Test
	public void script1() {

		System.setProperty("webdriver.chrome.driver", "//Users//sambitsobhan//Downloads//chromedriver");
		WebDriver d6=new ChromeDriver();
		d6.get("http://www.leafground.com/pages/Link.html");
		
	    d6.findElement(By.partialLinkText("go")).click();
	    d6.navigate().back();
	    
		d6.findElement(By.partialLinkText("Find")).click();
		d6.navigate().back();
		
		
		d6.findElement(By.partialLinkText("Verify")).click();
		d6.navigate().back();
		
		d6.findElement(By.partialLinkText("go")).click();
		d6.navigate().back();
		
		
	    List<WebElement> links = d6.findElements(By.tagName("a"));
		System.out.println("The no of links are " + links.size());
		d6.close();
		
}
}