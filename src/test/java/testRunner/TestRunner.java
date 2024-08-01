package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

<<<<<<< Updated upstream
@CucumberOptions(features="src\\test\\java\\features",glue="stepDefinations",plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
=======
@CucumberOptions(features="src\\test\\java\\features",monochrome=true,glue="stepDefinations",plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
>>>>>>> Stashed changes
public class TestRunner  extends AbstractTestNGCucumberTests
{

}
