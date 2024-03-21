package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediff {
	ChromeDriver driver;
	String url="https://register.rediff.com/register/register.php?";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
//	@BeforeMethod
//	public void urlloading()
//	{
//		
//	}
	@Test(groups = {"smoke"})
	public void titleverification()
	{
		String actual=driver.getTitle();
		String exp="Rediff";
		if(exp.equals(actual))
		{
			System.out.println("The title is Rediff");
		}
		else
		{
			System.out.println("the title is not Rediff");
		}
	}
	@Test(groups= {"regression"})
	public void logo()
	{
		boolean img=driver.findElement(By.xpath("//div[@id='wrapper']/table/tbody[1]/tr[1]/td[1]/img")).isDisplayed();
		if(img)
		{
			System.out.println("The logo is present");
		}
		else
		{
			System.out.println("The logo is not present");
		}
	}
	@Test(groups = {"regression"})
	public void labelcheck()
	{
		String label=driver.getPageSource();
		if(label.contains("Full Name"))
		{
			System.out.println("The label is present");
		}
		else
		{
			System.out.println("The label is not present");
		}
	}
	@Test(groups = {"regression"})
	public void creataccbutton()
	{
		WebElement button=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
		System.out.println("Is create account button present");
		System.out.println(button.isSelected());
	}
	@Test(groups = {"smoke"})
	public void creatacctext()
	{
		WebElement text=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
		String text1=text.getAttribute("value");
		String exp="Creat my account";
		if(text1.contains(exp))
		{
			System.out.println("Text is verified");
		}
		else
		{
			System.out.println("Text is not verified");
		}
	}
	@AfterTest
	public void close()
	{
		driver.quit();
	}

}
