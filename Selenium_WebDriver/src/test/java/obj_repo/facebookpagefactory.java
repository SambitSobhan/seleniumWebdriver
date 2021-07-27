package obj_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class facebookpagefactory {
	WebDriver driver;
	public  facebookpagefactory(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="pass")
	WebElement pswd;
	
	@FindBy(xpath="//button[@name='login']")
	WebElement login;
	
	@FindBy(linkText="Forgotten password?")
	 WebElement forgotpwd;
	
	 public WebElement Emailid() {
	    	return email;	
	    }
	    
	    public WebElement password() {
	    	return pswd;	
	    }
	    public WebElement loggin() {
	    	return login;	
	    }
	    public WebElement forgotpwd() {
	    	return forgotpwd;
	    }
	}

