package testclasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pages.AddToCart;
import pages.Search;
import pages.Spirit;
import utility.ReadProp;

public class BaseTest {
	
public static WebDriver driver;

Search search;

Spirit spirit;

AddToCart addtocart;
	
	@BeforeSuite
	public void initBrowser() throws IOException
	{
		if(ReadProp.getPropData("browser").equals("Chrome"))
		{
		 driver = new ChromeDriver();
		}
		else if(ReadProp.getPropData("browser").equals("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.get(ReadProp.getPropData("url"));
	}
	
	
	@BeforeClass
	public void createObject()
	{
		search = new Search(driver);
		
		spirit = new Spirit(driver);
		
		addtocart = new AddToCart(driver);
	}
	
	
	
//	@AfterSuite
//	public void tearDown()
//	{
//		driver.close();
//	}

	
	
}
