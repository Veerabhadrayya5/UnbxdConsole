package script;

import java.util.ArrayList;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.BaseTest;
import generic.ExcelData;
import pom.DepartmentsPage;
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
	/*	String v=ExcelData.getCellValue(INPUT_PATH, "Sheet1", 0, 0);
		log.info("CellValue"+v);
		String v1=ExcelData.getCellValue(INPUT_PATH, "Sheet1", 0, 1);
		log.info("CellValue"+v1);
	*/
		ep.setEmail("veerabhadrayya.s@unbxd.com");
//	ep.setEmail(v);
		
		Thread.sleep(2000);
		ep.setClickNext();
		Thread.sleep(2000);
		ep.setpwd("veerabhadrayya@@5");
		//ep.setpwd(v1);
		Thread.sleep(2000);
		ep.setClickNext();
		Thread.sleep(2000);
		
		DepartmentsPage dp=new DepartmentsPage(driver);
		dp.setClickAllCustomer();
		ArrayList<String> ar=new ArrayList<String> (driver.getWindowHandles());
		int x=ar.size();
		log.info(x);
		driver.switchTo().window(ar.get(1));
		driver.findElement(By.xpath("//a/span[contains(.,'select a site key')]")).click();
	}

}
