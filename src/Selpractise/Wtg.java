package Selpractise;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Wtg {
	ChromeDriver driver;
	String url="https://wayanadantouchgarden.com/";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void operations()
	{
		String actual=driver.getTitle();
		String exp="Wayanadan touch garden";
		if(exp.equals(actual))
		{
			System.out.println("title verified");
		}
		else
		{
			System.out.println("Title is not verified");
			System.out.println("Actual title is "+actual);
		}
	}

}
