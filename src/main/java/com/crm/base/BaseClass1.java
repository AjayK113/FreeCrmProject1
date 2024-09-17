package com.crm.base;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import com.crm.util.Testutil;

import io.github.bonigarcia.wdm.WebDriverManager;

//public class BaseClass1 {
	
	/*public static WebDriver driver;
	Testutil testutil= new Testutil();
	String url = testutil.getBaseUrl();
	/*static String browser = testutil.getBrowser();

	public static void main(String[] args) {
		

		
	/*	@BeforeClass
	//	public void setUp()
		{
		//	switch(browser.toLowerCase())
			{
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;

			case "msedge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;

			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			default:
				driver = null;
				break;

			}

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get(url);

		}


	}

	private static void setUp() {
		// TODO Auto-generated method stub
		
	}

	private static void Setup() {
		// TODO Auto-generated method stub
		
	}

}
*/
