package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class test1 {
	@Test
	public void webdriverLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\10721254\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
				options.addArguments("start-maximized");
				options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");
	}
}
