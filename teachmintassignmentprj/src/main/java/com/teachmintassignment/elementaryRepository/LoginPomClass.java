package com.teachmintassignment.elementaryRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.teachmintassignment.genericutilities.PomBasePage;

public class LoginPomClass extends PomBasePage
{

	public LoginPomClass(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="user-input")
	WebElement mobileNumberTextField;
	
	public void enterMobileNo(String mobileNo)
	{
		mobileNumberTextField.sendKeys(mobileNo);
	}
	
	@FindBy(xpath="//input[@id='send-otp-btn-id']")
	WebElement clickOnSendButton;
	
	public void clickSendButton()
	{
		clickOnSendButton.click();
	}
	
	@FindBy(xpath="//input[@class='otp-digit-input']")
	WebElement otpTextField;
	
	public void sendOtp(String otpNo)
	{
		otpTextField.sendKeys(otpNo);
	}
	
	@FindBy(id="submit-otp-btn-id")
	WebElement clickOnSubmitOtp;
	
	public void clickSubmit()
	{
		clickOnSubmitOtp.click();
	}
	
}
