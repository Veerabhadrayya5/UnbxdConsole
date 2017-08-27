package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.BaseTest;
import pom.EmailPwdPage;
import pom.LoginPage;
public class Test extends BaseTest {
	
/*	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
*/
	@org.testng.annotations.Test
public void m1() throws InterruptedException
{
		// TODO Auto-generated method stub
/*	WebDriver driver=new ChromeDriver();
	driver.get("https://console.unbxd.com/unbxdlogin");
*/
		
		LoginPage lp = new LoginPage(driver);
		lp.setLoginclick();
		Thread.sleep(5000);
		EmailPwdPage ep = new EmailPwdPage(driver);
		ep.setEmail("veerabhadrayya.s@unbxd.com");
		Thread.sleep(2000);
		ep.setClickNext();
		Thread.sleep(2000);
		ep.setpwd("veerabhadrayya@@5");
		Thread.sleep(2000);
		ep.setClickNext();
		
		
	}

}
