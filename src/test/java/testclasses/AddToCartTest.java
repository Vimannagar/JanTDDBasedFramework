package testclasses;

import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {
	
	
	@Test(priority = 8)
	public void selectItem()
	{
		addtocart.selectBrandSize();
	}
	
	@Test(priority = 9)
	public void verifyAddToCart()
	{
		addtocart.addItemToCart();
	}

	
	@Test(priority = 10)
	public void searchOnCartPage()
	{
		addtocart.searchItems("wine");
		
		addtocart.getSearchResults();
	}
}
