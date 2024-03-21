package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerteg {
	ChromeDriver driver;
	String url="file:///F:/task/alert_eg.html";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void operations()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a= driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println("Alert text: "+alerttext);
		a.accept();
		driver.findElement(By.name("firstname")).sendKeys("anitha");
		driver.findElement(By.name("lastname")).sendKeys("sasi");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
	}
	
	

}
