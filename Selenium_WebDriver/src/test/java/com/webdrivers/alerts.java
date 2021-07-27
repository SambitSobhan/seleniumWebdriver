package com.webdrivers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class alerts {
	@Test

	public void script1() {
		System.setProperty("webdriver.chrome.driver", "//Users//sambitsobhan//Downloads//chromedriver");
		WebDriver d7=new ChromeDriver();
		d7.get("http://www.leafground.com/pages/Alert.html");
		d7.findElement(By.xpath("//button[@onclick=\"normalAlert()\"]")).click();
		d7.switchTo().alert().accept();
		
		d7.findElement(By.xpath("//button[@onclick=\"confirmAlert()\"]")).click();
		d7.switchTo().alert().dismiss();
		
		d7.findElement(By.xpath("//button[@onclick=\"confirmPrompt()\"]")).click();
		Alert alert=d7.switchTo().alert();
		alert.sendKeys("hello");
		alert.accept();
		
		d7.findElement(By.xpath("//button[@onclick=\"lineBreaks()\"]")).click();
		Alert alert2=d7.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.accept();
		
		d7.findElement(By.xpath("//button[@onclick=\"sweetalert()\"]")).click();
	    d7.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();
}
}
