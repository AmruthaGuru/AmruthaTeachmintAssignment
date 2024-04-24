package com.teachmintassignment.genericutilities;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseClass extends ReusableMethods
{	
	public WebDriver driver;
	
	@BeforeMethod
	public void browserSetup(Method method) throws IOException 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		if(getPropertyFile("browser").equals("chrome")) {
		driver=new ChromeDriver(options);
		}else if(getPropertyFile("browser").equals("firefox")){
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_TIMEOUT));
		driver.get(getPropertyFile("url"));
		initObjects(driver);
	}
	
	@AfterMethod
	public void browserTearDown() {
		driver.quit();
	}
}
