package testclasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utility.ExcelReader;

public class SearchTest extends BaseTest
{
	
	
	@Test(priority = 1)
	public void verifyTitle()
	{
		String title = search.getTitleOfPage();
		
		boolean ispresent = title.contains("Mumbai");
		
		Assert.assertEquals(ispresent, true);
	}
	
	@Test(priority = 2)
	public void searchProduct() throws IOException
	{
		search.searchItems(ExcelReader.readData(3, 0));
	}
	
	
	@Test(priority = 3)
	public void validateSearchResults()
	{
		search.getSearchResults();
	}

}
