package testngpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertpgm {
	ChromeDriver driver;
	String url="https://www.facebook.com";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void assertpract()
	{
		String exp="Facebook";
		String actual=driver.getTitle();
		Assert.assertEquals(actual, exp);
		System.out.println("Title is not verified");
	}

}
