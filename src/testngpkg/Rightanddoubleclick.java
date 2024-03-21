package testngpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rightanddoubleclick {
	ChromeDriver driver;
	String url="https://demo.guru99.com/test/simple_context_menu.html";
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void operation()
	{
		WebElement right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		WebElement doublec= driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		
		Actions act=new Actions(driver);
		act.contextClick(right).perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span")).click();
		driver.switchTo().alert().accept();
		Actions act1=new Actions(driver);
		act1.doubleClick(doublec).perform();
		Alert a= driver.switchTo().alert();
		System.out.println("text: "+a.getText());
		a.accept();
	}
	

}
