package com.webdrivers;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class javascriptexec1{
	@Test
	public void script1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users//sambitsobhan//Downloads//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		JavascriptExecutor datepick = ((JavascriptExecutor)driver);
		datepick.executeScript("arguments[0].value = arguments[1]",driver.findElement(By.id("datepicker1")),"27-10-2021");  

		datepick.executeScript("arguments[0].value=arguments[1]", driver.findElement(By.id("datepicker2")),"27-10-2021");
		
		driver.navigate().to("https://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("AMD");
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("GOI");
		datepick.executeScript("arguments[0].value = arguments[1]",driver.findElement(By.id("ctl00_mainContent_view_date1")),"25-07-2021");
		datepick.executeScript("arguments[0].value = arguments[1]",driver.findElement(By.id("ctl00_mainContent_view_date2")),"25-08-2021");
}
}