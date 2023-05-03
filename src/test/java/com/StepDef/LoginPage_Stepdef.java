package com.StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import com.PageObjectModel.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginPage_Stepdef {
	public static WebDriver driver;
	private LoginPage loginpage;


	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\10721254\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		
	

				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@After(order=1)
	public void takeScreenshotOnFailure(io.cucumber.java.Scenario scenario) {
		if(scenario.isFailed())
		{
			TakesScreenshot ts= (TakesScreenshot) driver;
			byte[] src = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/png", "screenshot");
		}
		

	}
	
	@After(order=0)
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}


	@Given("i am on the opencart login page")
	public void i_am_on_the_opencart_login_page() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		 loginpage= new LoginPage(driver);
	}
	
	@Given("I have entered valid username and password")
	public void i_have_entered_valid_username_and_password() throws InterruptedException {
		loginpage.enterEmail("ramvignesh85@gmail.com");
		loginpage.enterPassword("vicky007");
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() throws InterruptedException {
		loginpage.clickLoginButton();
	}

	@Then("I should be logged in successfully")
	public void i_should_be_logged_in_successfully() {
		Assert.assertEquals("My Account", driver.getTitle());
	}
	
	@Given("^I have entered invalid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_have_entered_invalid_something_and_something(String username, String password) throws Throwable {
       loginpage.enterEmail(username);
       loginpage.enterPassword(password);
	}
	
	@Then("^I should see an error message indicating as warning message$")
    public void i_should_see_an_error_message_indicating_as_warning_message() throws Throwable {
          Assert.assertTrue(driver.findElement(By.xpath("//div[text()=' Warning: No match for E-Mail Address and/or Password.']")).isDisplayed());
	}
	

	@Given("I click on the forgotten password link")
	public void i_click_on_the_forgotten_password_link() throws InterruptedException {
		loginpage.forgotPasswordButtonClick();
	}

	@Then("I should be redirected to the forgot password page")
	public void i_should_be_redirected_to_the_forgot_password_page() {
		Assert.assertEquals("Forgot Your Password?", driver.getTitle());
	}
}
