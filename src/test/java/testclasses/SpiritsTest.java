package testclasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utility.ExcelReader;

public class SpiritsTest extends BaseTest {
		
	@Test(priority = 4)
	public void selectProduct()
	{
		spirit.selectSpirits();
	}
	
	@Test(priority = 5)
	public void sortByHighPrice() throws InterruptedException, IOException
	{
		Thread.sleep(3000);
		spirit.sortDropdown(ExcelReader.readData(1, 0));
		
	}
	
	
	@Test(priority = 6)
	public void sortByAlphabet() throws InterruptedException, IOException
	{
		Thread.sleep(3000);
		spirit.sortDropdown(ExcelReader.readData(2, 0));
	}
		
	
	@Test(priority = 7)
	public void verifyUrlOfPage() throws IOException
	{
		
		String url = spirit.getCurrentUrlOfPage();
		
		String urlfromexcel = ExcelReader.readData(0, 0);
		
		Assert.assertEquals(url, urlfromexcel);
		
	
		
	}
	
	

}
