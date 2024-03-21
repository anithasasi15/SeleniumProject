package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesourcepgm {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		//String url1="https://www.google.com";
		//driver.get(url1);
		String url2="https://www.facebook.com";
		driver.get(url2);
		String pagesource=driver.getPageSource();
		
		if(pagesource.contains("Gmail"))
		{
			System.out.println("Gmail is present");
		}
		else
		{
			System.out.println("Gmail is not present");
		}
		driver.quit();
	}

}
