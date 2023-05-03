package com.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage{
	
	private WebDriver driver;
	private By EmailInputLocator =By.id("input-email");
	private By PasswordInputLocator =By.id("input-password");
	private By LoginButtonLocator =By.xpath("//input[@type='submit']");
	private By ForgotPasswordButtonLocator =By.linkText("Forgotten Passwor");
	private By LogoutButtonLocator =By.linkText("Logout");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		//PageFactory.initElements(driver, this);
	}
	
	public void enterEmail(String username) throws InterruptedException {
		WebElement emailInput = driver.findElement(EmailInputLocator);
		emailInput.sendKeys(username);
		Thread.sleep(2000);
	}
	
	public void enterPassword(String password) throws InterruptedException {
		WebElement passwordInput = driver.findElement((By) PasswordInputLocator);
		passwordInput.sendKeys(password);
		Thread.sleep(2000);
	}
	
	public void clickLoginButton() throws InterruptedException {
		WebElement loginClick =driver.findElement((By) LoginButtonLocator);
		loginClick.click();
		Thread.sleep(2000);
	}
	
	public void forgotPasswordButtonClick() throws InterruptedException {
		WebElement forgotpasswordbutton = driver.findElement((By) ForgotPasswordButtonLocator);
		forgotpasswordbutton.click();
		Thread.sleep(2000);
	}
	
	public void logoutButtonClick() throws InterruptedException {
		WebElement logoutbutton = driver.findElement((By) LogoutButtonLocator);
		logoutbutton.click();
		Thread.sleep(2000);
	}
	
	public void login(String username, String password) throws InterruptedException {
		enterEmail(username);
		enterPassword(password);
		clickLoginButton();
		Thread.sleep(2000);

	}
	
	public void logout() throws InterruptedException {
		logout();
		Thread.sleep(2000);

	}
	
	public String forgotPasswordPageUrl() {
		String forgotpasswordpageurl = driver.getCurrentUrl();
		return forgotpasswordpageurl;

	}
		
	
}