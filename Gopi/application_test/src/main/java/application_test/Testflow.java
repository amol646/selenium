package application_test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testflow {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/e3020651/Downloads/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://readiness.efdservices.com/main/cmse/Home");
		driver.findElement(By.id("userid")).sendKeys("wl2b086");
		driver.findElement(By.id("password")).sendKeys("Month#03");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("maskedCardNumber")).sendKeys("1122384000735505");
		driver.findElement(By.id("searchSubmit")).click();
		
		driver.findElement(By.linkText("Addresses")).click();
		//driver.findElement(By.xpath("//div[@id='PHYAddressData']/span")).click();
		
		//driver.findElement(By.id("address1")).sendKeys("123 main streeet");
		//driver.findElement(By.xpath("//span[contains(text(),'Cancel')]")).click();
		
		
		driver.findElement(By.linkText("Info")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'close')]")).click();
		//Alert a =driver.switchTo().alert();
		//a.dismiss();
		
		
		Set whand=driver.getWindowHandles();
		System.out.println(whand);
		//driver.switchTo().
		driver.quit();
	}

}
