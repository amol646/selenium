package wrapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Wrapper {

	protected static WebDriver driver;
	public String url;
	protected static Properties prp=new Properties();
	JavascriptExecutor jse;
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
			jse = (JavascriptExecutor) driver;
			driver.get(url);
			driver.manage().window().maximize();		
			breturn=true;	
						
		} catch (Exception e) {
			// TODO: handle exception
		}
		return breturn;		
	}

	
	public boolean launchchrome()
	{
		boolean breturn=false;
		
		try {			
			System.setProperty("webdriver.chrome.driver", "C:/Users/e3020651/Downloads/chromedriver.exe");
			
			driver=new ChromeDriver();
			jse = (JavascriptExecutor) driver;
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
			//System.out.println(idss);
			jse.executeScript("arguments[0].setAttribute('style';border:3px solid red;');", driver.findElement(By.id(idss)));
			driver.findElement(By.id(idss)).click();
			Thread.sleep(3000);
			breturn=true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return breturn;
	}
	
	public boolean ClickByLinkText(String link1)
	{
		boolean breturn=false;
		try {
			driver.findElement(By.linkText(link1)).click();
			Thread.sleep(3000);
			breturn=true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return breturn;
	}
	public boolean ClickByXpath(String xpath1)
	{
		boolean breturn=false;
		try {
			driver.findElement(By.xpath(xpath1)).click();
			Thread.sleep(3000);
			breturn=true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return breturn;
	}



}
