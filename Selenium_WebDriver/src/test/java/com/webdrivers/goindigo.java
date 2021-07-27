package com.webdrivers;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class goindigo {
	@Test

	

	public void script1() {
		System.setProperty("webdriver.chrome.driver", "//Users//sambitsobhan//Downloads//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
		driver.switchTo().frame(1).findElement(By.id("Click")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abd");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("devillers");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("abd@gmail.com");
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("abdbangluru");
		WebElement staticDropdown1=driver.findElement(By.id("day"));
		Select dropdown=new Select(staticDropdown1);
		dropdown.selectByIndex(17);
        WebElement staticDropdown2=driver.findElement(By.id("month"));
		Select dropdown2=new Select(staticDropdown2);
		dropdown2.selectByVisibleText("Feb");
		
		WebElement staticDropdown3=driver.findElement(By.id("year"));
			Select dropdown3=new Select(staticDropdown3);
			dropdown3.selectByValue("1984");	
			
		driver.findElement(By.xpath("//input[@id='u_d_3_Gc']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		driver.manage().window().maximize();
		Dimension dim=new Dimension(200,400);
	    driver.manage().window().setSize(dim);
	    
}
}
