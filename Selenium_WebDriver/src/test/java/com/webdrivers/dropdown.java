package com.webdrivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdown {
	@Test

	public void script1() {
		System.setProperty("webdriver.chrome.driver", "//Users//sambitsobhan//Downloads//chromedriver");
		WebDriver d3=new ChromeDriver();
		
		d3.get("http://www.leafground.com/pages/Dropdown.html");
		
		
		//select by index
		
		WebElement staticDropdown=d3.findElement(By.id("dropdown1"));
		
		Select dropdown=new Select(staticDropdown);
		dropdown.selectByIndex(2);
		
		
		//select by visible text
		
		WebElement Dropdown2=d3.findElement(By.name("dropdown2"));
		
		Select dropdown2=new Select(Dropdown2);
		
		dropdown2.selectByVisibleText("Loadrunner");
		
		//select by value
		
        WebElement Dropdown3=d3.findElement(By.id("dropdown3"));
		
		Select dropdown3=new Select(Dropdown3);
		
		dropdown3.selectByValue("3");
		
		
		
		//print out no of options present in the dropdown
		
		WebElement opt=d3.findElement(By.xpath("//select[@class='dropdown']"));
		Select option=new Select(opt);
	    List <WebElement> op = option.getOptions();
	    int size = op.size();
	    for(int i =0; i<size ; i++)
	    {
	    System.out.println(op.get(i).getText());
	    }
	    
	     //select from dropdown using sendkeys
	    
	     d3.findElement(By.xpath("//div[@class='example'] [5]/select[1]")).sendKeys("L");
	     
	     
	     //selecting multiple options in dropdown
	     
	     WebElement Dropdown4=d3.findElement(By.xpath("//div[@class='example'][6]/select[1]"));
	     
	     Select dropdown4=new Select(Dropdown4);
	     
	     dropdown4.selectByIndex(1);
	     dropdown4.selectByIndex(2);
	     dropdown4.selectByIndex(3);
	     dropdown4.selectByIndex(4);
	     
	    
	     
	  
}
}