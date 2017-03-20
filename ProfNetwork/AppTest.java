package ProfNetwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class AppTest 
{	
	public static WebDriver driver;
	
	@Test
	public void testCases() {
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		
		AppObjects ao = new AppObjects(driver);
		ao.getUsername().sendKeys("jufeh");
		ao.getPswd().sendKeys("wdc56");
		ao.getSignIn().click();
	}
	
	@AfterTest
	public void closeBrowser(){
		driver.quit();
	}
}
