package com.webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class buttons {

    @Test
	public void script1() {
		System.setProperty("webdriver.chrome.driver", "//Users//sambitsobhan//Downloads//chromedriver");
		WebDriver d2=new ChromeDriver();
		d2.get("http://www.leafground.com/pages/Button.html");
		d2.findElement(By.id("position")).click();
		d2.findElement(By.id("color")).click();
		d2.findElement(By.id("size")).click();
		d2.findElement(By.id("home")).click();
		d2.quit();
		

        }
}

