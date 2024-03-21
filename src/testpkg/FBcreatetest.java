package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.FBcreatepage;

public class FBcreatetest {
	WebDriver driver;
	String url="https://www.facebook.com";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void test()
	{
		FBcreatepage ob=new FBcreatepage(driver);
		ob.createpage();
	}

}
