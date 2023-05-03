import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class dummy {
	public static void main(String[] args) {
		
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\10721254\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(options);
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			

}
}
