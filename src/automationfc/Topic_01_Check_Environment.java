package automationfc;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Topic_01_Check_Environment {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://automationfc.com/");
	}
	
	@Test
	public void TC_01_ValidatePageUrl() {
		//Login Page Url matching
		String loginPageUrl = driver.getCurrentUrl();
		Assert.assertEquals(loginPageUrl, "https://automationfc.com/");
	}
	
	@Test
	public void TC_02_ValidatePageTitle() {
		Login Page Title
		String loginPageTitle = driver.getCurrentUrl();
		Assert.assertEquals(loginPageTitle, "AUTOMATION FC BLOG");
	}
	
	//@Test
	//public void TC_03_LoginFormDisplayed() {
		//Login Form Displayed
		//Assert.assertTrue(driver.findElement(By.xpath("//form[@name='frmLogin']")).isDisplayed());
	//}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}