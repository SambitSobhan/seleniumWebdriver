package com.webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class tooltip {
	@Test
	public void script1() {
		System.setProperty("webdriver.chrome.driver", "//Users//sambitsobhan//Downloads//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
	    WebElement wiki=driver.findElement(By.xpath("//input[@type='email']"));
	  
	    //we can use action class to get the tooltip
	    Actions wikisrch=new Actions(driver);
	    wikisrch.moveToElement(wiki).perform();
	    WebElement toolTip=driver.findElement(By.xpath("//div[@class='col-sm-4 col-xs-4 tooltptext']"));
	    String a=toolTip.getText();
	    System.out.println(a);
}
}