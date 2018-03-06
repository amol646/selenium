package issuermanagement;


import java.io.IOException;

import org.testng.annotations.BeforeSuite;

public class Imsewrapper extends Wrapper {
	
	@BeforeSuite
	public void luaunchingbeforeprp() throws IOException
	{
		urldetails();
		//launchchrome();
		launchie();
		loadprp();
	}
	
	
	

}
