package com.teachmintassignment.genericutilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PomBasePage extends ReusableMethods
{
	public PomBasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
