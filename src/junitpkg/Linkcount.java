package junitpkg;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
	ChromeDriver driver;
	String url="https://www.facebook.com";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void linkcounting()
	{
		List<WebElement> linkdetails=driver.findElements(By.tagName("a"));
		System.out.println(linkdetails.size());
		for (WebElement link:linkdetails)
		{
			System.out.println(link.getText()+" - "+link.getAttribute("href"));
		}
		
	}
	@After
	public void closing()
	{
		driver.quit();
	}

}