package optionManager;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pages.PagaManager;
import utilities.BaseTest;

public class ContextTestSetUp 
{
	public WebDriver driver;
	public BaseTest baseTest;
	public PagaManager pageM;
	public ContextTestSetUp() throws IOException
	{
		baseTest = new BaseTest();
		pageM = new PagaManager(baseTest.getDriver());
	}

}
