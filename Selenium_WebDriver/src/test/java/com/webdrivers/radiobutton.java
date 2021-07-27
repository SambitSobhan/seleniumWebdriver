package com.webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class radiobutton {
	@Test

	public void script1() {
		System.setProperty("webdriver.chrome.driver", "//Users//sambitsobhan//Downloads//chromedriver");
		WebDriver d4=new ChromeDriver();
		d4.get("http://www.leafground.com/pages/radio.html");
		d4.findElement(By.id("yes")).click();
		d4.findElement(By.name("news")).click();
		d4.findElement(By.xpath("//input[@value='2']")).click();
		d4.close();
        }
}