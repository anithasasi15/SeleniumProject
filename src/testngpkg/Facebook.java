package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebook {
	ChromeDriver driver;
	String url="https://www.facebook.com";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Parameters({"login","password"})
	@Test
	public void login(String login,String password)
	{
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(login);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}
	

}
