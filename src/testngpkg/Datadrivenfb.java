package testngpkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadrivenfb {
	EdgeDriver driver;
	String url="https://www.facebook.com/";
	@BeforeTest
	public void setup()
	{
		driver=new EdgeDriver();
	}
	@Test
	public void datadriven() throws IOException
	{
		driver.get(url);
		FileInputStream fi=new FileInputStream("C:\\Users\\MITHUN\\Desktop\\fblogin.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet1");
		int rowcount=sh.getLastRowNum();
		System.out.println("Row count: "+rowcount);
		for(int i=1;i<=rowcount;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username: "+username);
			String pw=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("password: "+pw);
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.name("pass")).sendKeys(pw);
			driver.findElement(By.name("login")).click();
			
		}
	}

}
