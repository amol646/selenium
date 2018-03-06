package testcases;

import org.testng.annotations.Test;

import pages.Loginpage;
import wrapper.Imsewrapper;


public class Testcase0012 extends Imsewrapper {

	
	@Test
	public void launch()
	{
		System.out.println("TC001");
		
		new Loginpage().Enteruserid("w951aeq").Enterpasswordid("Month$10").Loginbuttonclick();
		//new Pagesflow().Enteruserid("w951aeq").Enterpasswordid("Month$10").Loginbuttonclick();
	}
}
