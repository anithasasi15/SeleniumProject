package Selpractise;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manoramaxpath {
	ChromeDriver driver;
	String url="https://id.manoramaonline.com/login?client_id=mm-online-live&continue=632d7989-def9-4c49-b941-a85992035846||mm-online-live";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void signin()
	{
		driver.findElement(By.xpath("//form[@id='login']/div[1]/div[2]/div/div/input")).sendKeys("anitha@gmail.com");
		driver.findElement(By.xpath("//form[@id='login']/div[2]/div/input")).sendKeys("anitha123");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
