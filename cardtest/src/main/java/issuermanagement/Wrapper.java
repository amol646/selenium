package issuermanagement;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Wrapper {

	protected static InternetExplorerDriver driver;
	public String url;
	protected static Properties prp=new Properties();
	public boolean urldetails()
	{
		boolean breturn=false;		
		try {
			Properties prp=new Properties();
			prp.load(new FileInputStream("E:/Gopi/cardtest/webdeatils.xml"));			
			url=prp.getProperty("weburl");
			breturn=true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return breturn;
	}	
	public boolean launchie()
	{
		boolean breturn=false;
		
		try {			
			System.setProperty("webdriver.ie.driver", "C:/Users/e3020651/Downloads/IEDriverServer.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			capabilities.setCapability("requireWindowFocus", true);
			driver=new InternetExplorerDriver(capabilities);
			
			driver.get(url);
			driver.manage().window().maximize();		
			breturn=true;	
						
		} catch (Exception e) {
			// TODO: handle exception
		}
		return breturn;		
	}

	public void loadprp() throws IOException, IOException 
	{
		//prp=new Properties();
		prp.load(new FileInputStream(new File("E:/Gopi/cardtest/properties.xml")));
		System.out.println(prp);
	}

	public boolean VerifyTitle(String title)
	{
		boolean breturn=false;
		try {
			
			if(driver.getTitle().equalsIgnoreCase(title))
			{
				System.out.println("Landed in page " + driver.getTitle());
				//System.out.println(driver.getCurrentUrl());
			}
			breturn=true;	

		} catch (Exception e) {
			// TODO: handle exception
		}
		return breturn;
	}

	public boolean EnterById(String id,String val)
	{
		boolean breturn=false;
		try {
			driver.findElement(By.id(id)).clear();
			driver.findElement(By.id(id)).sendKeys(val);
			breturn=true;			
		} catch (Exception e) {
			// TODO: handle exception
		}		
		return breturn;
	}

	public boolean ClickById(String idss)
	{
		boolean breturn=false;
		try {
			System.out.println(idss);
			driver.findElement(By.id(idss)).click();
			Thread.sleep(3000);
			breturn=true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return breturn;
	}



}
