package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepartmentsPage {

	@FindBy(xpath="//a/b[text()='All Customer Sites']")
private WebElement clickAllCustomer;
	public DepartmentsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setClickAllCustomer()
	{
		clickAllCustomer.click();
	}
	
	
}
