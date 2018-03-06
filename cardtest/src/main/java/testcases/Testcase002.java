package testcases;

import org.testng.annotations.Test;

import pages.Loginpage;
import wrapper.Imsewrapper;


public class Testcase002 extends Imsewrapper {

	
	@Test
	public void launch()
	{
		System.out.println("TC002");
		
		new Loginpage().Enteruserid("w951aeq").Enterpasswordid("Month$10").Loginbuttonclick().EnterInsId("00548").EnterCardNumber("4411250000089389")
		.ClickSearchSubBtn().ClickLogoutLink();
		//new Pagesflow().Enteruserid("w951aeq").Enterpasswordid("Month$10").Loginbuttonclick();
	}
}
