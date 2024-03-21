package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fbloginvalidation {
	String baseurl="https://automationexercise.com/login";
	String exp="https://automationexercise.com/";
	EdgeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new EdgeDriver();
		driver.get(baseurl);
	}
	@Test
	public void validation()
	{
		driver.findElement(By.name("email")).sendKeys("anitha.sasi15@gmail.com");
		driver.findElement(By.name("password")).sendKeys("anitha123");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
		String actual=driver.getCurrentUrl();
		if(actual.equals(exp))
		{
			System.out.println("Login is successful!");
		}
	}

}
