package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandle {
	EdgeDriver driver;
	String url="https://demo.guru99.com/popup.php";
	@BeforeTest
	public void setup()
	{
		driver=new EdgeDriver();
		driver.get(url);
	}
	@Test
	public void handling()
	{
		String parentWindow=driver.getWindowHandle();
		driver.findElement(By.xpath("/html/body/p/a")).click();
		Set<String> allWindow=driver.getWindowHandles();
		for(String handle: allWindow)
		{
			if(!handle.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.name("emailid")).sendKeys("anitha@gmail.com");
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
