package cardtest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Cosumerval  {
	@Test
	public void testflow() {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/e3020651/Downloads/chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		try {
			driver.get("https://www2.readiness.consumercardaccess.com/main/FIS-QA-DPC-STD-Login/Home");
			
			driver.findElement(By.id("cardholder_number")).sendKeys("1122384000734151");
			driver.findElement(By.id("secure-id")).sendKeys("1234");
			
			Thread.sleep(8000);
			
			driver.findElement(By.name("submit-login")).click();
			
		} catch (Exception e) {
			// TODO: handle exception
			driver.close();
		}
		
		
		
	}
}
