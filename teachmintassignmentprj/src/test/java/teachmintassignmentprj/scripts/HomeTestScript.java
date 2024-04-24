package teachmintassignmentprj.scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.teachmintassignment.elementaryRepository.HomePomClass;
import com.teachmintassignment.elementaryRepository.LoginPomClass;
import com.teachmintassignment.genericutilities.BaseClass;

public class HomeTestScript extends BaseClass
{
	@Test
	public void TC_HomeTS_001() throws InterruptedException
	{
		LoginPomClass lp=new LoginPomClass(driver);
		lp.enterMobileNo("0000020232");
		lp.clickSendButton();
		lp.sendOtp("120992");
		lp.clickSubmit();
		
		HomePomClass hp=new HomePomClass(driver);
		hp.getMouseHoverOnAutomation().click();
		Thread.sleep(3000);
		hp.handleShadowRoot();
		hp.getMouseOverOnAdministration().click();
		Thread.sleep(1000);
		hp.getClickOnCertificates().click();
		
	}
}