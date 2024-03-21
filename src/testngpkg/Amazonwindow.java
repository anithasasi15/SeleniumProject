package testngpkg;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonwindow {
	ChromeDriver driver;
	String url="https://www.amazon.in/";
	@BeforeTest
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void operations() throws InterruptedException
	{
		driver.manage().window().maximize();
		WebElement mob=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		mob.sendKeys("mobiles",Keys.ENTER);
		String exp="Amazon.in : mobiles";
		String actual=driver.getTitle();
		if(exp.equals(actual))
		{
			System.out.println("Title is validated");
		}
		else
		{
			System.out.println("Title is not validated");
		}
		String basewindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		Set<String> newwindow=driver.getWindowHandles();
		for(String handle:newwindow)
		{
			if(!handle.equalsIgnoreCase(basewindow))
			{
				driver.switchTo().window(handle);
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,500)");
				Thread.sleep(6000);
//				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[3]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[36]/div[1]/span/span/span/input")));
				driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[3]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input")).click();
			}
		}
		
		}

}
