package issuermanagement;

import java.util.concurrent.TimeUnit;

import org.apache.poi.util.Units;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Loginflowcheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver","C:/Users/e3020651/Downloads/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.ie.driver", "C:/Users/e3020651/Downloads/IEDriverServer.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		capabilities.setCapability("requireWindowFocus", true);
		WebDriver driver=new InternetExplorerDriver(capabilities);
		
		driver.get("http://d05jbweb02.metavante.com:5082/main/imse/home");
		driver.manage().window().maximize();
		driver.findElement(By.id("userid")).sendKeys("w951aeq");
		driver.findElement(By.id("password")).sendKeys("Month$10");
		driver.findElement(By.xpath("//input[@id='loginButton']")).click();
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		
	}

}
