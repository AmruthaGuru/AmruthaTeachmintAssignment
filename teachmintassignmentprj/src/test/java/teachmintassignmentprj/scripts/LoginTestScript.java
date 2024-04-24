package teachmintassignmentprj.scripts;

import org.testng.annotations.Test;
import com.teachmintassignment.elementaryRepository.LoginPomClass;
import com.teachmintassignment.genericutilities.BaseClass;

public class LoginTestScript extends BaseClass
{
	@Test
	public void TC_LoginTS_001()
	{
		LoginPomClass lp=new LoginPomClass(driver);
		lp.enterMobileNo("0000020232");
		lp.clickSendButton();
		lp.sendOtp("120992");
		lp.clickSubmit();
	}
}
