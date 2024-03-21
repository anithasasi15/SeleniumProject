package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon 
{
ChromeDriver driver;
String url="https://www.amazon.in/";
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
}
	@Test
public void operations()
{
	WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	search.sendKeys("mobiles",Keys.ENTER);
	driver.findElement(By.xpath("//div[@id='nav-xshop']/a[3]")).click();
	driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
	driver.navigate().back();
	driver.findElement(By.xpath("//div[@id='nav-cart-count-container']/span[1]")).click();
	driver.findElement(By.xpath("//div[@id='nav-main']/div[1]/a/i")).click();

	
}
	@After
	public void closing()
	{
		driver.quit();
	}
}
