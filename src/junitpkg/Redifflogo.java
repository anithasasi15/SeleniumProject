package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redifflogo {
	ChromeDriver driver;
	String url="https://register.rediff.com/register/register.php?";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	@Test
	public void operation()
	{
		WebElement img=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		System.out.println("Is logo present?");
		System.out.println(img.isDisplayed());
		boolean button=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected();
		if(button)
		{
			System.out.println("Male is selected");
		}
		else
		{
			System.out.println("Male is not selected");
		}
	}

}
