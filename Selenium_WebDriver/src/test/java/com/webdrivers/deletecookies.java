package com.webdrivers;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class deletecookies {
	@Test
	public void script1() {
		System.setProperty("webdriver.chrome.driver", "//Users//sambitsobhan//Downloads//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		Cookie fb=new Cookie("sam","123456789");
		driver.manage().addCookie(fb);
		
		System.out.println(driver.manage().getCookies());
		driver.manage().deleteCookie(fb);
		
		
	}
}
