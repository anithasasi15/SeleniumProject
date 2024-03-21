package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automationexercise {
	ChromeDriver driver;
	String url="https://automationexercise.com/";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void operations()
	{
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("Anitha");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("anithasasi@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
		//loggedin
		driver.findElement(By.xpath("//*[@id=\"id_gender2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("anitha123");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Select day=new Select(driver.findElement(By.xpath("//*[@id=\"days\"]")));
		day.selectByValue("14");
		Select month=new Select(driver.findElement(By.xpath("//*[@id=\"months\"]")));
		month.selectByValue("9");
		Select year=new Select(driver.findElement(By.xpath("//*[@id=\"years\"]")));
		year.selectByValue("1993");
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Anitha");
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("Sasi");
		driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("Luminar");
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("abc");
		js.executeScript("window.scrollBy(250,750)");
		driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("abc");
		driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("kerala");
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("ekm");
		driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("682018");
		driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("123456789");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();
	}

}
