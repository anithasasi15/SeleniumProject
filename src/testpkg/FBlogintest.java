package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.FBloginpage;

public class FBlogintest {
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
		FBloginpage ob=new FBloginpage(driver);
		ob.setvalues("anitha@gmail.com", "anitha123");
		ob.login();
	}

}
