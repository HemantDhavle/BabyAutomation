package pages;

import org.openqa.selenium.WebDriver;

public class PagaManager 
{
	public WebDriver driver;
	public SearchPage searchPage;
	public PagaManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public SearchPage getSearchPage()
	{
		searchPage = new SearchPage(driver);
		return searchPage;
	}

}
