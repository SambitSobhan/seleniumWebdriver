package com.webdrivers;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class excelapache {
	@Test
	public static void script1()throws IOException
	{
	System.setProperty("webdriver.chrome.driver", "//Users//sambitsobhan//Downloads//chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	
	FileInputStream xel=new FileInputStream("/Users/sambitsobhan/Documents/New Folder With Items/checkingapache .xlsx");
	
	XSSFWorkbook work=new XSSFWorkbook(xel);
	XSSFSheet sheet1=work.getSheet("master");

	for(int i=1; i<sheet1.getLastRowNum();i++)
    {
        // Import data for Email.
        XSSFCell cell= sheet1.getRow(i).getCell(1);
        driver.findElement(By.id("email")).sendKeys(cell.getStringCellValue());
        driver.findElement(By.id("email")).clear();
         
        // Import data for password.
       XSSFCell pswd = sheet1.getRow(i).getCell(2);
        driver.findElement(By.id("pass")).sendKeys(cell.getStringCellValue());
        driver.findElement(By.id("pass")).clear();
            
    }
} 

	 

	
}
