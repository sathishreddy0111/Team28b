package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base_Class 
{
	public static WebDriver driver;
	public Base_Class(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
}
