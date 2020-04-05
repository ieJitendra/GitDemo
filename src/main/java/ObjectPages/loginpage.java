package ObjectPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class loginpage {

	WebDriver driver;
	public loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	By username=By.xpath("//*[@id=\"login1\"]");
	By Password=By.name("passwd");
	By sign=By.name("proceed");
	By Home=By.linkText("rediff.com");
	public WebElement Emailid()
	{
		return driver.findElement(username);
	}
	public WebElement password()
	{
		return driver.findElement(Password);
		
	}
	public WebElement submit()
	{
		return driver.findElement(sign);
		
	}
	public WebElement Home()
	{
		return driver.findElement(Home);
		
	}
	
	
}
