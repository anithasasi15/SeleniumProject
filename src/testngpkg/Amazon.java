package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon {
	ChromeDriver driver;
	String url="https://www.amazon.in/";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void task()
	{
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		search.sendKeys("mobiles",Keys.ENTER);
		String exp=driver.getTitle();
		String actual="Amazon.in : mobiles";
		if(exp.equals(actual))
		{
			System.out.println("Title verified");
		}
		else
		{
			System.out.println("Title not verified");
		}
		String parentWindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		Set<String> allWindow=driver.getWindowHandles();
		for(String handle: allWindow)
		{
			if(!handle.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[3]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[36]/div[1]/span/span/span/input")).click();
				driver.findElement(By.xpath("//*[@id=\"attach-close_sideSheet-link\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"nav-cart-count-container\"]/span[2]")).click();
				driver.close();
			}
			driver.switchTo().window(parentWindow);
		}
		
		
	}
	@AfterTest
	public void closing()
	{
		driver.quit();
	}

}
