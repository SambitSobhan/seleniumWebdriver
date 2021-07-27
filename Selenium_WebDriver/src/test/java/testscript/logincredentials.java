package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import obj_repo.facebookpage;

public class logincredentials {
	@Test
	public void loginfbk() {
		System.setProperty("webdriver.chrome.driver", "//Users//sambitsobhan//Downloads//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		facebookpage fb=new facebookpage(driver); 
		fb.Emailid().sendKeys("ssb@gmail.com");
		fb.password().sendKeys("abd7devillers");
		fb.loggin().click();
	
	}
	
	
}
