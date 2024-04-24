package com.teachmintassignment.genericutilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableMethods implements ProjectConstants
{
	public Actions action;
	public WebDriverWait wait;
	public JavascriptExecutor js;
	
	public String getPropertyFile(String key) throws IOException {
		File file=new File(PROPERTIES_PATH);
		FileInputStream fis=new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(fis);
	   return prop.getProperty(key);
	}
	
	public void initObjects(WebDriver driver) {
		action=new Actions(driver);
		wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_TIMEOUT));
	}
	
	
}
