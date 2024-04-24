package com.teachmintassignment.elementaryRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.teachmintassignment.genericutilities.PomBasePage;

public class HomePomClass extends PomBasePage
{

	public HomePomClass(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[text()='Automation']")
	private WebElement mouseHoverOnAutomation;

	public WebElement getMouseHoverOnAutomation() {
		return mouseHoverOnAutomation;
	}

	public void setMouseHoverOnAutomation(WebElement mouseHoverOnAutomation) {
		this.mouseHoverOnAutomation = mouseHoverOnAutomation;
	}
	
	@FindBy(xpath="//div[@class='Sidebar_sidebarItem__3T049 Sidebar_activeSidebarItem__3EpWz']")
	private WebElement mouseOverOnIcon;

	public WebElement getMouseOverOnIcon() {
		return mouseOverOnIcon;
	}

	public void setMouseOverOnIcon(WebElement mouseOverOnIcon) {
		this.mouseOverOnIcon = mouseOverOnIcon;
	}
	
	@FindBy(xpath="//div[text()='Administration']")
	private WebElement mouseOverOnAdministration;

	public WebElement getMouseOverOnAdministration() {
		return mouseOverOnAdministration;
	}

	public void setMouseOverOnAdministration(WebElement mouseOverOnAdministration) {
		this.mouseOverOnAdministration = mouseOverOnAdministration;
	}
	
	@FindBy(tagName = "releases-panel")
	private WebElement shadowHostElement;

	public WebElement getShadowHostElement() {
		return shadowHostElement;
	}

	public void setShadowHostElement(WebElement shadowHostElement) {
		this.shadowHostElement = shadowHostElement;
	}
	
	// handle shadow root element
	
	   public void handleShadowRoot()
	   {
		   SearchContext shadowRootElement = shadowHostElement.getShadowRoot();
		   shadowRootElement.findElement(By.cssSelector("path[d='M6 18L18 6M6 6l12 12']")).click();
	   }
	   
	 @FindBy(xpath="//a[text()='Certificates']")
	 private WebElement clickOnCertificates;

	public WebElement getClickOnCertificates() {
		return clickOnCertificates;
	}

	public void setClickOnCertificates(WebElement clickOnCertificates) {
		this.clickOnCertificates = clickOnCertificates;
	}
}
