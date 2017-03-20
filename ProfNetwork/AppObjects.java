package ProfNetwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppObjects {

	public static WebDriver driver;
	
	public AppObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this); // extra for POFP

	}
	
	@FindBy(xpath=".//*[@id='login-email']")
	WebElement username;
	
	@FindBy(id="login-password")
	WebElement pswd;
	
	@FindBy(id="login-submit")
	WebElement signIn;

	public WebElement getUsername(){
		return username;
	}
	
	public WebElement getPswd(){
		return pswd;
	}
	
	public WebElement getSignIn(){
		return signIn;
	}
	
	
	}