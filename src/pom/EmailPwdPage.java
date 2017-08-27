package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailPwdPage {

	@FindBy(xpath="//input[@name='identifier']")
	private WebElement email;
	@FindBy(xpath="//span[contains(.,'Next')]")
private WebElement clickNext;
	@FindBy(xpath="//input[@name='password']")
	private WebElement pwd;

	public EmailPwdPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	public void setEmail(String emailid)
	{
		email.sendKeys(emailid);
	}

	public void setpwd(String password)
	{
		pwd.sendKeys(password);
	}

public void setClickNext()
{
	clickNext.click();
}

}
