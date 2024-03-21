package junitpkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotpgm {
	ChromeDriver driver;
	String url="https://www.facebook.com";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void screen() throws IOException
	{
		//to save in system drive
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("F://fbscreenshot1.png"));
		//to save in java project folder
		WebElement loginbutton=driver.findElement(By.name("login"));
		File src1=loginbutton.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1, new File("./Screenshots/fbloginbutton.png"));
		/*WebElement createb=driver.findElement(By.xpath("//*[@id=\"u_0_0_dm\"]"));
		File src2=createb.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src2, new File("./Screenshots/creatb.png"));*/
		
	}
	

}
