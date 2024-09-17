package com.crm.base;

import java.io.FileInputStream;
import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass {
	public static WebDriver driver;
    public static Properties prop;
    
 public BaseClass() throws IOException {
	
		prop=new Properties();
		FileInputStream fis = new FileInputStream("E:\\new selenium\\FreeCRMTest1\\src\\main\\java\\com\\crm\\config\\data.properties");
		prop.load(fis);
 }
	public void driverLunch() {
		
		String browsername = prop.getProperty("browser");
			//System.setProperty("webdriver.chrome.driver","E:\\new selenium\\FreeCRMTest1\\Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	
	}
	
}
	


