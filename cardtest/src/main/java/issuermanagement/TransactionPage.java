package issuermanagement;

public class TransactionPage extends Wrapper {
	public TransactionPage() {
		// TODO Auto-generated constructor stub
		if(!VerifyTitle("Transaction History"))
		{
			System.out.println("title(landign page) landed into wrong page-Signup page");
		}
	}

	

}
