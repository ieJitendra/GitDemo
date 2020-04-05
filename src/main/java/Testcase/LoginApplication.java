package Testcase;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ObjectPages.Loginhomepage;
import ObjectPages.loginpage;

public class LoginApplication {

	@Test
	public void Login()
	{
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		WebDriver driver = new	FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		loginpage lp= new loginpage(driver);
		lp.Emailid().sendKeys("Jitendra");
		lp.password().sendKeys("9205311604");
		//lp.submit().click();
		lp.Home().click();
		Loginhomepage lhp=new Loginhomepage(driver);
		lhp.search().sendKeys("rediff");;
		lhp.Submit().click();;
		
	}
}
