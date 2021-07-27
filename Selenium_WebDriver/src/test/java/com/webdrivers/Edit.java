package com.webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Edit {
	@Test
	public void script1() {
		System.setProperty("webdriver.chrome.driver", "//Users//sambitsobhan//Downloads//chromedriver");
		WebDriver d1=new ChromeDriver();
		
		d1.get("http://www.leafground.com/");
		
		d1.findElement(By.linkText("Edit")).click();
		
		d1.findElement(By.id("email")).sendKeys("ssb@gmail.com");
		
		d1.findElement(By.cssSelector("input[value='Append ']")).clear();
		d1.findElement(By.cssSelector("input[value='Append ']")).sendKeys("sam");
	
		d1.findElement(By.name("username")).clear();
		
		d1.findElement(By.name("username")).sendKeys("how are you");
		d1.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		d1.findElement(By.xpath("//input[@value='Clear me!!']")).sendKeys("hello");
		d1.close();
		d1.quit();

		
	}

}
