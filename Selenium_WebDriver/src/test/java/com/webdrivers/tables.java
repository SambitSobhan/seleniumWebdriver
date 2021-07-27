package com.webdrivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tables {
	@Test

	public void script1() {
	System.setProperty("webdriver.chrome.driver", "//Users//sambitsobhan//Downloads//chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/table.html");
	WebElement columns = driver.findElement(By.xpath("//table[@id='table_id']/tbody/tr"));
	List<WebElement>Totalcolumn=columns.findElements(By.tagName("th"));
	System.out.println("Total Number of column "+Totalcolumn.size());
	
	
	
	WebElement rows = driver.findElement(By.xpath("//table[@id='table_id']/tbody"));
	List<WebElement>Totalrows=rows.findElements(By.tagName("tr"));
	System.out.println("Total Number of rows "+Totalrows.size());
	
	System.out.println(driver.findElement(By.xpath("//table[@id='table_id']/tbody/tr[3]/td[2]")).getText());
	
	
	System.out.println(driver.findElement(By.xpath("//tr[@class='even'][2]")).getText());


}
}
