package junitpkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinkresponse {
	ChromeDriver driver;
	String url="https://www.facebook.com";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
    public void testing()
    {
		List<WebElement> l= driver.findElements(By.tagName("a"));
		System.out.println("Total number of links: "+l.size());
		for(WebElement ele:l)
		{
			String link=ele.getAttribute("href");
			verify(link);
		}
    }
	private void verify(String link) 
	{
		try
		{
			URL u=new URL(link);
			HttpURLConnection con= (HttpURLConnection)u.openConnection();
			if(con.getResponseCode()==200)
			{
				System.out.println("The response code= 200, The connection is successful");
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println("The response code is 404, The link is broken");
			}
			else
			{
				System.out.println("The response code is unexpected");
			}
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
	}
	
}
