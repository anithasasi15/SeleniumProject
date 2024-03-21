package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relxpathpgm 
{
	ChromeDriver driver;
	String url="https://www.instagram.com";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void login() throws InterruptedException
	{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form[@id='loginForm']/div/div[1]/div/label/input")).sendKeys("anitha.mithun");
		WebElement pass = driver.findElement(By.xpath("//form[@id='loginForm']/div/div[2]/div/label/input"));
		pass.sendKeys("abc123",Keys.ENTER);
		//driver.findElement(By.xpath("//form/div/div[3]/button")).click();
		
	}
}
