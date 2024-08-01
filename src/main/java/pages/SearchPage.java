package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utilities.BaseTest;
import utilities.genericMethods;

public class SearchPage 
{
	public WebDriver driver;
	public genericMethods genM;
	public BaseTest baseTest;
	
	String firstPart = "//a[contains(text(),'";
	String secondPart = "')]";
	By next = By.linkText("Next");
	public SearchPage(WebDriver driver)
	{
		this.driver = driver;
		genM = new genericMethods(driver);
		baseTest = new BaseTest();
	}
	
	public void openWebsite() throws IOException
	{
		genM.openURL(baseTest.getProperties().getProperty("url"));
	}
	
	public void searchBaby(String babyName)
	{
		String fullname=firstPart+babyName+secondPart;
		////a[contains(text(),'
		By name = By.xpath(fullname);
	List<WebElement> namesList  = genM.getElements(name);
	Select sel = new Select(driver.findElement(By.name("page")));
	Actions act = new Actions(driver);
	//JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
	int count = 0;
	while(true)
	{
		if(!(namesList.size()==1))
		{
			genM.doClick(next);
			namesList  = genM.getElements(name);
		}
		else
		{
			By meaning = By.xpath(fullname+"/../parent::td/following-sibling::td[3]//a");
			String text = genM.getTex(meaning);
			System.out.println("Meaning is "+text);
			break;
		}
	}
	}
	

}
