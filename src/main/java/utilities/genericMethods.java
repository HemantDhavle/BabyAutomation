package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class genericMethods 
{
	public WebDriver driver;
	
	public genericMethods(WebDriver driver)
	{
		this.driver = driver;
	}

	public void openURL(String url)
	{
		driver.get(url);
	}
	
	public List<WebElement> getWebElements(By  by) {
		return driver.findElements(by);
	}
	
	public List<WebElement> constructXpath(String part1, String val , String part2)
	{
		return driver.findElements(By.xpath(part1+val+part2));
	}
	
	public List<WebElement> getElements(By by)
	{
		return driver.findElements(by);
	}
	public String getTex(By by)
	{
		return driver.findElement(by).getText();
	}
	
	public void doClick(By by)
	{
		driver.findElement(by).click();
	}
}
