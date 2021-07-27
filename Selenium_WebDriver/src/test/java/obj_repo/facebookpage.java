package obj_repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class facebookpage {
	
	
	WebDriver driver;
	public  facebookpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By email=By.id("email");
	By pswd=By.id("pass");
	By login=By.xpath("//button[@name='login']");
    By forgotpwd=By.linkText("Forgotten password?");
    
    
    public WebElement Emailid() {
    	return driver.findElement(email);	
    }
    
    public WebElement password() {
    	return driver.findElement(pswd);	
    }
    public WebElement loggin() {
    	return driver.findElement(login);	
    }
    public WebElement forgotpwd() {
    	return driver.findElement(forgotpwd);
    }
}
