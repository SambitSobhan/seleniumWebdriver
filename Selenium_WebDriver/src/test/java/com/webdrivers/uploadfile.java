package com.webdrivers;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class uploadfile {
	@Test
	public void script1() throws AWTException {
		System.setProperty("webdriver.chrome.driver", "//Users//sambitsobhan//Downloads//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://smallpdf.com/word-to-pdf");
		driver.findElement(By.cssSelector(".sc-1rd62mt-2.ejRuwW")).click();
		String fileword="/Users/sambitsobhan/Downloads/New Folder With Items/DAY2.docx";
		StringSelection select=new StringSelection(fileword);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
		
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_META);
		 
		robot.keyPress(KeyEvent.VK_TAB);
		 
		robot.keyRelease(KeyEvent.VK_META);
		 
		robot.keyRelease(KeyEvent.VK_TAB);
		 
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_META);
		 
		robot.keyPress(KeyEvent.VK_SHIFT);
		 
		robot.keyPress(KeyEvent.VK_G);
		 
		robot.keyRelease(KeyEvent.VK_META);
		 
		robot.keyRelease(KeyEvent.VK_SHIFT);
		 
		robot.keyRelease(KeyEvent.VK_G);
		robot.keyPress(KeyEvent.VK_META);
		 
		robot.keyPress(KeyEvent.VK_V);
		 
		robot.keyRelease(KeyEvent.VK_META);
		 
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		 
		robot.keyRelease(KeyEvent.VK_ENTER);
		 
		robot.delay(500);
		 
		robot.keyPress(KeyEvent.VK_ENTER);
		 
		robot.keyRelease(KeyEvent.VK_ENTER);
		 
		robot.keyPress(KeyEvent.VK_ENTER);
		 
}
}