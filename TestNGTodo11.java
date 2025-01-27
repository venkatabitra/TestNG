package newversion1;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.junit.Assert.assertEquals;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;
public class TestNgSenario1{
		WebDriver driver;
	WebDriverWait wait;
	@BeforeMethod
	public void setUp()  {
		System.setProperty("webdriver.chrome.driver", "D://ChromeDiver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		DesiredCapabilities capabilities = new DesiredCapabilities();
	try {
					
driver = new RemoteWebDriver(new URL("http:// padmabitra7: AU1v4CkLQgG3AjnAxRdQlrULeWWBGTS9gYeee6Ul8xzXc4DcbF@hub.lambdatest.com/wd/hub"),capabilities);			
		} catch (MalformedURLException e) {
					e.printStackTrace();
		}    	  


					}
	@Test
	public void Testing() throws InterruptedException {
		//Test Scenario 1
		driver.get("https://lambdatest.com/selenium-playground/");
		WebDriverWait wait = new WebDriverWait(driver, 100);
		Thread.sleep(3000);
				SoftAssert  Assert = new SoftAssert();
		       String pageHeader = driver.findElement(By.tagName("h1")).getText();
		     Assert.assertEquals(pageHeader, "Selenium Playground", "Page header mismatch");
			           driver.quit(); 	           
		       }
  					}