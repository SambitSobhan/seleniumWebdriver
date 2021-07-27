package com.webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class checkbox {
	
    @Test
	public void script1() {
		System.setProperty("webdriver.chrome.driver", "//Users//sambitsobhan//Downloads//chromedriver");
		WebDriver d5=new ChromeDriver();
		d5.get("http://www.leafground.com/pages/checkbox.html");
		d5.findElement(By.xpath("//input[@type='checkbox']")).click();
		d5.findElement(By.xpath("//section[@class='innerblock']/div[1]/div[2]/input[@type='checkbox']")).click();
		d5.findElement(By.xpath("//section[@class='innerblock']/div[1]/div[3]/input[@type='checkbox']")).click();
		
		
		///check the box is selected or not
		
		WebElement cb=d5.findElement(By.xpath("//section[@class='innerblock']/div[2]/div[1]/input[@type='checkbox']"));
		System.out.println("The checkbox is selection state is - " + cb.isSelected());
		
		///deselect the selected checkbox
		
		d5.findElement(By.xpath("//section[@class='innerblock']/div[3]/div[2]/input[@type='checkbox']")).click();
		
		
		
		//check all the boxes.
		d5.findElement(By.xpath("//section[@class='innerblock']/div[4]/div[1]/input[@type='checkbox']")).click();
		d5.findElement(By.xpath("//section[@class='innerblock']/div[4]/div[2]/input[@type='checkbox']")).click();
		d5.findElement(By.xpath("//section[@class='innerblock']/div[4]/div[3]/input[@type='checkbox']")).click();
		d5.findElement(By.xpath("//section[@class='innerblock']/div[4]/div[4]/input[@type='checkbox']")).click();
		d5.findElement(By.xpath("//section[@class='innerblock']/div[4]/div[5]/input[@type='checkbox']")).click();
		
		

}
}