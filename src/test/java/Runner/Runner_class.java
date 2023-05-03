package Runner;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(features={"C:\\Users\\10721254\\eclipse-workspace\\selenium\\Resources\\Features"},
			glue ={"com.StepDef"},
			plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
					"pretty"
					},
			monochrome=true
			
			)
	
	public class Runner_class extends AbstractTestNGCucumberTests
	{
		public static WebDriver driver;
		@DataProvider (parallel = false)
		public Object[][] scenario() {
			return super.scenarios();
		}
		
	
		
	}
		
		
		
