package com.webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class scrollinselenium {
	

	@Test
	public void script1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users//sambitsobhan//Downloads//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		Dimension browser = new Dimension(400,600);
		driver.manage().window().setSize(browser);
		JavascriptExecutor scroll=(JavascriptExecutor) driver;
		
		//scroll down
		scroll.executeScript("scroll(0,3000)");
		
		
		//scroll particular coordinate
		scroll.executeScript("window.scrollBy(380,1700)");
		
		
		//scroll down
		scroll.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		
	   //scroll horizontal right
		scroll.executeScript("scroll(500,0)");
		
		
		
		//scroll horizontal left
		scroll.executeScript("window.scrollBy(-380,1700)");
		
		
		
		//scroll till a desired element appears.
		
	    WebElement img1=driver.findElement(By.xpath("/html/body/div[2]/section/div[7]/div/div[1]/p[6]/img"));
	
	   
	    scroll.executeScript("arguments[0].scrollIntoView()", img1);
		
		
		
}
}