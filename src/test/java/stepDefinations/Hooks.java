package stepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import optionManager.ContextTestSetUp;

public class Hooks 
{
	ContextTestSetUp contextTestSetUp;
	public Hooks(ContextTestSetUp contextTestSetUp)
	{
		this.contextTestSetUp = contextTestSetUp;
	}
	
	@After
	public void tearDown() throws IOException
	{
		contextTestSetUp.baseTest.getDriver().quit();
	}
	
	@AfterStep
	public void screenshot(Scenario scenario) throws IOException
	{
		if(scenario.isFailed())
		{
		TakesScreenshot ts = (TakesScreenshot)contextTestSetUp.baseTest.getDriver();
		File fs = ts.getScreenshotAs(OutputType.FILE);
		byte[] arr = FileUtils.readFileToByteArray(fs);
		scenario.attach(arr, "image/png", "image");
	}
	}
}
