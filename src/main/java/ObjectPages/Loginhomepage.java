package ObjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginhomepage {

	WebDriver driver;
	public Loginhomepage(WebDriver driver)
	{
		this.driver=driver;
	}
	By search=By.id("srchword");
	By submit=By.xpath("//*[@id=\"queryTop\"]/input");
	public WebElement search()
	{
		return driver.findElement(search);
	}
	
	public WebElement Submit()
	{
		return driver.findElement(submit);
	}
	
	
}
