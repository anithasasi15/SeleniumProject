package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FBloginpage {
	WebDriver driver;
	By fbuser=By.id("email");
	By fbpass=By.id("pass");
	By fblog=By.name("login");
	
	public FBloginpage(WebDriver driver) {
		this.driver=driver;
		}
	
	public void setvalues(String email, String password)
	{
		driver.findElement(fbuser).sendKeys(email);
		driver.findElement(fbpass).sendKeys(password);
	}
	public void login()
	{
		driver.findElement(fblog).click();
	}

}
