package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
	EdgeDriver driver;
	String url="https://demo.guru99.com/test/drag_drop.html";
	@BeforeTest
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.get(url);
	}
	@Test
	public void operation()
	{
		WebElement bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement money1=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement acc1=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		WebElement amt1=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		WebElement sales=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement money2=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement acc2=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		WebElement amt2=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		Actions act=new Actions(driver);
		act.dragAndDrop(bank, acc1);
		act.dragAndDrop(money1, amt1);
		act.dragAndDrop(sales, acc2);
		act.dragAndDrop(money2, amt2);
		act.perform();
		String actual=driver.getPageSource();
		String exp="Perfect";
		if(actual.contains(exp))
		{
			System.out.println("Perfect is displayed");
		}
		else
		{
			System.out.println("Perfect is not displayed");
		}
	}

}
