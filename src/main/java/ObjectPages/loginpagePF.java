package ObjectPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class loginpagePF {

	WebDriver driver;
	public loginpagePF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	/*By username=By.xpath("//*[@id=\"login1\"]");
	By Password=By.name("passwd");
	By sign=By.name("proceed");
	By Home=By.linkText("rediff.com");*/
	@FindBy(xpath="//*[@id=\"login1\"]")
	WebElement username;
	
	@FindBy(name="passwd")
	WebElement Password;
	
	@FindBy(name="proceed")
	WebElement sign;
	@FindBy(linkText="rediff.com")
	WebElement Home;
	
	public WebElement Emailid()
	{
		return username;
	}
	public WebElement password()
	{
		return Password;
		
	}
	public WebElement submit()
	{
		return sign;
		
	}
	public WebElement Home()
	{
		return Home;
		
	}
	
	
}
