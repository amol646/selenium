package issuermanagement;

import org.testng.annotations.Test;


public class Testcase001 extends Imsewrapper {

	
	@Test
	public void launch()
	{
		System.out.println("TC001");
		
		new Pagesflow().Enteruserid("w951aeq").Enterpasswordid("Month$10").Loginbuttonclick().EnterInsId("00548").EnterCardNumber("4411250000089389")
		.ClickSearchSubBtn();
		//new Pagesflow().Enteruserid("w951aeq").Enterpasswordid("Month$10").Loginbuttonclick();
	}
}
