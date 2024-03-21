package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupsendkey {
	ChromeDriver driver;
	String url="https://www.demo.guru99.com/test/upload/";
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void fileup()
	{
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("F:\\fbscreenshot1.png");
		WebElement clk= driver.findElement(By.xpath("//*[@id=\"terms\"]"));
		if(clk.isSelected())
		{
			System.out.println("The check box is selected");
		}
		else
		{
			System.out.println("The check box is not selected");
			clk.click();
			System.out.println("The check box is marked now");
		}
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	}

}
