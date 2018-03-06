package pages;

import wrapper.Wrapper;

public class Homepage extends Wrapper {
	public Homepage() {
		// TODO Auto-generated constructor stub
		if(!VerifyTitle("Cardholder Search"))
		{
			System.out.println("title(landign page) landed into wrong page-Signup page");
		}
	}
	public Homepage EnterInsId(String Insid)
	{
		EnterById(prp.getProperty("Homepage.institution.id"),Insid);
		return this;
	}

	public Homepage EnterCardNumber(String Cardnumber)
	{
		EnterById(prp.getProperty("Homepage.cardnumbertextbox.id"),Cardnumber);
		return this;
	}


	public TransactionPage ClickSearchSubBtn()
	{
		ClickById((prp.getProperty("Homepage.searchBtn.id")));
		return new TransactionPage();
	}
	
	public Loginpage ClickLogoutLink()
	{
		ClickByLinkText((prp.getProperty("Homepage.Logoutlink.linktext")));
		return new Loginpage();
	}


}
