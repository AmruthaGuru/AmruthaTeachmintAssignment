package com.teachmintassignment.elementaryRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.teachmintassignment.genericutilities.PomBasePage;

public class CertificatePomClass extends PomBasePage
{

	public CertificatePomClass(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//h6[text()='School leaving certificate']")
	private WebElement clickOnSchoolLeavingCertificate;

	public WebElement getClickOnSchoolLeavingCertificate() {
		return clickOnSchoolLeavingCertificate;
	}

	public void setClickOnSchoolLeavingCertificate(WebElement clickOnSchoolLeavingCertificate) {
		this.clickOnSchoolLeavingCertificate = clickOnSchoolLeavingCertificate;
	}
	
	@FindBy(xpath="//div[text()='Generate']")
	private WebElement clickOnGenerate1;

	public WebElement getClickOnGenerate1() {
		return clickOnGenerate1;
	}

	public void setClickOnGenerate1(WebElement clickOnGenerate1) {
		this.clickOnGenerate1 = clickOnGenerate1;
	}
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement clickOnSearchField;

	public WebElement getClickOnSearchField() {
		return clickOnSearchField;
	}

	public void setClickOnSearchField(WebElement clickOnSearchField) {
		this.clickOnSearchField = clickOnSearchField;
	}
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement clickOnCheckBox;

	public WebElement getClickOnCheckBox() {
		return clickOnCheckBox;
	}

	public void setClickOnCheckBox(WebElement clickOnCheckBox) {
		this.clickOnCheckBox = clickOnCheckBox;
	}
	
	@FindBy(xpath="//div[text()='Generate']")
	private WebElement clickOnGenerate2;

	public WebElement getClickOnGenerate2() {
		return clickOnGenerate2;
	}

	public void setClickOnGenerate2(WebElement clickOnGenerate2) {
		this.clickOnGenerate2 = clickOnGenerate2;
	}
	
	@FindBy(xpath="//input[@placeholder='Remarks' and @class='krayon__TextInput-module__3VrcP']")
	private WebElement enterValueToRemarks;

	public WebElement getEnterValueToRemarks() {
		return enterValueToRemarks;
	}

	public void setEnterValueToRemarks(WebElement enterValueToRemarks) {
		this.enterValueToRemarks = enterValueToRemarks;
	}
	
	@FindBy(xpath="//span[text()='Show changes in preview']")
	private WebElement clickOnPreview;

	public WebElement getClickOnPreview() {
		return clickOnPreview;
	}

	public void setClickOnPreview(WebElement clickOnPreview) {
		this.clickOnPreview = clickOnPreview;
	}
	
	@FindBy(xpath="//div[text()='Generate']")
	private WebElement clickOnGenerate3;

	public WebElement getClickOnGenerate3() {
		return clickOnGenerate3;
	}

	public void setClickOnGenerate3(WebElement clickOnGenerate3) {
		this.clickOnGenerate3 = clickOnGenerate3;
	}
	
	@FindBy(xpath="//div[text()='Download']")
	private WebElement clickOnDownload;

	public WebElement getClickOnDownload() {
		return clickOnDownload;
	}

	public void setClickOnDownload(WebElement clickOnDownload) {
		this.clickOnDownload = clickOnDownload;
	}
	
}
