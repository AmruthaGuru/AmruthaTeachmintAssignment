package teachmintassignmentprj.scripts;

import org.testng.annotations.Test;

import com.teachmintassignment.elementaryRepository.CertificatePomClass;
import com.teachmintassignment.elementaryRepository.HomePomClass;
import com.teachmintassignment.elementaryRepository.LoginPomClass;
import com.teachmintassignment.genericutilities.BaseClass;

public class CertificateTestScript extends BaseClass
{
	@Test
	public void TC_Certificate_001() throws InterruptedException
	{
		LoginPomClass lp=new LoginPomClass(driver);
		lp.enterMobileNo("0000020232");
		Thread.sleep(1000);
		lp.clickSendButton();
		Thread.sleep(1000);
		lp.sendOtp("120992");
		lp.clickSubmit();
		
		HomePomClass hp=new HomePomClass(driver);
		hp.getMouseHoverOnAutomation().click();
		Thread.sleep(3000);
		hp.handleShadowRoot();
		Thread.sleep(3000);
		hp.getMouseOverOnAdministration().click();
		Thread.sleep(1000);
		hp.getClickOnCertificates().click();
		
		CertificatePomClass cp=new CertificatePomClass(driver);
		cp.getClickOnSchoolLeavingCertificate().click();
		cp.getClickOnGenerate1().click();
		cp.getClickOnSearchField().sendKeys("sam");
		cp.getClickOnCheckBox().click();
		cp.getClickOnGenerate2().click();
		Thread.sleep(4000);
		cp.getEnterValueToRemarks().sendKeys("NoRemarks");
		Thread.sleep(4000);
		cp.getClickOnPreview().click();
		Thread.sleep(3000);
		cp.getClickOnGenerate3().click();
		Thread.sleep(3000);
		cp.getClickOnDownload().click();
	}
}
