package testngpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuprobotclass {
	EdgeDriver driver;
	String url="https://www.ilovepdf.com/word_to_pdf";
	@BeforeTest
	public void setup()
	{
		driver = new EdgeDriver();
		driver.get(url);
	}
	@Test
	public void fileuploading() throws Exception
	{
	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
	fileUpload("F:\\task\\EBAY.docx");
	}
	public void fileUpload(String p) throws AWTException {
		StringSelection strSelection=new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
		
		Robot robot =new Robot();
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(2000);	
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
			
		
	}

}
