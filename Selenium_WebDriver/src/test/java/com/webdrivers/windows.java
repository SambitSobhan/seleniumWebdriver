package com.webdrivers;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class windows {
	@Test

	public void script1() {
		
		System.setProperty("webdriver.chrome.driver", "//Users//sambitsobhan//Downloads//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.findElement(By.id("home")).click();
		
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		Set<String> totalwindow=driver.getWindowHandles();
		System.out.println(totalwindow);
		System.out.println(totalwindow.size());
		
		Iterator<String> win=totalwindow.iterator();
		String childwindow=win.next();
		System.out.println(childwindow);
		
		//closing the child window 
	
		if(!parentwindow.equals(childwindow)) {
			driver.switchTo().window(childwindow);
			driver.close();
		}
		//using implicit wait in parent window.
		driver.switchTo().window(parentwindow);
		driver.findElement(By.xpath("//button[@onclick='openWindowsWithWait();']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Set<String> totalwindow2=driver.getWindowHandles();
		System.out.println(totalwindow2.size());
		
		driver.close();
		driver.quit();
		
	}
	
}
