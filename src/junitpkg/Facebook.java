package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	ChromeDriver driver;
	String url="https://www.facebook.com";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void fblogin()
	{
		driver.findElement(By.id("email")).sendKeys("abc123@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("aBC12");
		driver.findElement(By.name("login")).click();;
	}

}
