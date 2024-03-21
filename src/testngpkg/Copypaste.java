package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Copypaste {
	ChromeDriver driver;
	String url="https://register.rediff.com/register/register.php?";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void copypasting()
	{
		WebElement fullname=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		WebElement rediifid=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		fullname.sendKeys("anitha");
		Actions act=new Actions(driver);
		act.keyDown(fullname, Keys.CONTROL).sendKeys("a").keyUp(fullname, Keys.CONTROL);
		act.keyDown(fullname, Keys.CONTROL).sendKeys("c").keyUp(fullname, Keys.CONTROL);
		act.keyDown(rediifid, Keys.CONTROL).sendKeys("v").keyUp(rediifid, Keys.CONTROL);
		act.perform();
	}

}
