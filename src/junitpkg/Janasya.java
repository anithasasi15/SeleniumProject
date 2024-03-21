package junitpkg;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Janasya 
{
ChromeDriver driver;
String url="https://www.janasya.com";
@Before
public void setup()
{
  driver=new ChromeDriver();
  driver.get(url);
}
@Test
public void operations() throws InterruptedException

{
	Thread.sleep(1000);
	String actual="Janasya";
	String exp=driver.getTitle();
	if(actual.equalsIgnoreCase(exp))
	{
		System.out.println("The title is Janasya");
	}
	else
	{
		System.out.println("the title is not janasya");
	}
	driver.findElement(By.xpath("//div[@id='HeaderNavigation']/nav/ul/li[1]/a")).click();
	driver.findElement(By.xpath("//div[@id='halo-sidebar']/div[2]/div[1]/div[1]/h3")).click();
	driver.findElement(By.xpath("//div[@id='halo-sidebar']/div[2]/div[1]/div[2]/div/ul/li/a[1]/span[1]")).click();
//WebElement search=driver.findElement(By.xpath("//input[@id='Search-In-Modal']"));
//search.sendKeys("kurta",Keys.ENTER);
	
	//List<WebElement> linkdetails=driver.findElements(By.tagName("a"));
	//System.out.println("The total no.of links ="+linkdetails.size());
	//for(WebElement link:linkdetails)
	//{
		//System.out.println(link.getText()+" - "+link.getAttribute("href"));
	//}
	
	
}
@After
public void close()
{
	driver.quit();
}
}
