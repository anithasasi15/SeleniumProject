package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FBcreatepage {
	WebDriver driver;
	By createpage=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By signup=By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a");
	public FBcreatepage(WebDriver driver) {
		this.driver=driver;
	}
	public void createpage()
	{
		driver.findElement(createpage).click();
		String exp="Create a page";
		String actual=driver.getTitle();
		if(exp.equals(actual))
		{
			System.out.println("Title is verified");
		}
		else
		{
			System.out.println("Title is not verified");
			System.out.println("Actual title is: "+actual);
		}
		driver.findElement(signup).click();
	}
	

}
