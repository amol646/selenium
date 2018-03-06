package issuermanagement;

import org.junit.Test;

public class Pagesflow extends Wrapper {

	public Pagesflow() 
	{
		if(!VerifyTitle("Issuer Management System"))
		{
			System.out.println("title(landign page) landed into wrong page-Signup page");
		}
	}

	public Pagesflow Enteruserid(String string) {
		// TODO Auto-generated method stub
		EnterById(prp.getProperty("Loginpage.userid.id"),string);	
		return this;
	}

	public Pagesflow Enterpasswordid(String string) {
		// TODO Auto-generated method stub

		EnterById(prp.getProperty("Loginpage.password.id"),string);	
		return this;
	}

	public Homepage Loginbuttonclick(){
		// TODO Auto-generated method stub
		ClickById(prp.getProperty("Loginpage.loginbtn.id"));	
		//Thread.sleep(2000);
		return new Homepage();
	}

}
