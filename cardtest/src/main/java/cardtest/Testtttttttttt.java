package cardtest;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.TakesScreenshot;

public class Testtttttttttt {
	static WebDriver driver;
	static String primarywindow;
	static int a;

	public static void main(String[] args) throws InterruptedException, WebDriverException, IOException {
		// TODO Auto-generated method stub


		/*WebDriver driver;

		System.setProperty("webdriver.chrome.driver","C:/Users/e3020651/Downloads/chromedriver.exe");
		driver=new ChromeDriver();*/
		
		//System.setProperty("webdriver.ie.driver", "C:/Users/e3020651/Downloads/IEDriverServer.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		capabilities.setCapability("requireWindowFocus", true);
		//WebDriver driver = new InternetExplorerDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		//driver.get("http://d05jbweb02:1671/site/sfagentgift/Home");
		driver.get("https://readiness.batchcardorder.com/site/sfagentgift/Home");
		
		primarywindow=driver.getWindowHandle();	
		System.out.println("              Place Card Order page");
	

		//linktest();

		List<WebElement> link=driver.findElements(By.xpath("//div[@id='top-links']/a"));
		System.out.println(link.size());
		a=link.size();

		if(a!=0){
			for (int j = 1; j <=a; j++) {
				if(j==1)
				{
					String linkname=driver.findElement(By.xpath("//div[@id='top-links']/a["+j+"]")).getText();
					System.out.println(linkname);
					driver.findElement(By.xpath("//div[@id='top-links']/a["+j+"]")).click();
					System.out.println(driver.getCurrentUrl());					
				}
				else
				{
					String linkname=driver.findElement(By.xpath("//div[@id='top-links']/a["+j+"]")).getText();
					System.out.println(linkname);
					driver.findElement(By.xpath("//div[@id='top-links']/a["+j+"]")).click();
					Set<String> se=driver.getWindowHandles();
					for (String str : se) {	
						//System.out.println(str);
						if(str.contentEquals(primarywindow))
						{
							
						}
						else
						{
							driver.switchTo().window(str);			
							System.out.println(driver.getCurrentUrl());	
							FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),new File("C:/Users/e3020651/Desktop/testlinks/firstpage/"+linkname+".jpeg"));
							//FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),new File"");
							driver.switchTo().window(str).close();
							driver.switchTo().window(primarywindow);
						}
					}
				}

			}
		}




		driver.findElement(By.xpath("//div[@id='required-indicator']/parent::*/div[9]")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("cardCount")).sendKeys("25");
		driver.findElement(By.id("cardAmountDropDown")).sendKeys("5");
		driver.findElement(By.id("addButton")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("submitOrderButton")).click();

		Thread.sleep(1000);
		System.out.println("               Shipping/Payment Page ");
		List<WebElement> link1=driver.findElements(By.xpath("//div[@id='top-links']/a"));
		System.out.println(link1.size());
		a=link1.size();

		if(a!=0){
			for (int j = 1; j <=a; j++) {
				if(j==1)
				{
									
				}
				else
				{
					String linkname=driver.findElement(By.xpath("//div[@id='top-links']/a["+j+"]")).getText();
					System.out.println(linkname);
					driver.findElement(By.xpath("//div[@id='top-links']/a["+j+"]")).click();
					Set<String> se=driver.getWindowHandles();
					for (String str : se) {	
						//System.out.println(str);
						if(str.contentEquals(primarywindow))
						{

						}
						else
						{
							driver.switchTo().window(str);			
							System.out.println(driver.getCurrentUrl());			
							driver.switchTo().window(str).close();
							driver.switchTo().window(primarywindow);
						}
					}
				}

			}
		}

		
		driver.findElement(By.id("billBusName")).sendKeys("EPTEST");
		driver.findElement(By.id("billFirstName")).sendKeys("FNTEST");
		driver.findElement(By.id("billLastName")).sendKeys("TESTLNNAME");
		driver.findElement(By.id("billAddress1")).sendKeys("123 main street");
		driver.findElement(By.id("billCity")).sendKeys("milwaukee");
		driver.findElement(By.id("billState")).sendKeys("WISCONSIN");
		driver.findElement(By.id("billZip")).sendKeys("45102");
		driver.findElement(By.id("contactPhoneArea")).sendKeys("414");
		driver.findElement(By.id("contactPhonePrefix")).sendKeys("444");
		driver.findElement(By.id("contactPhone")).sendKeys("4555");
		driver.findElement(By.id("contactEmail")).sendKeys("test@fis.com");
		
		
		driver.findElement(By.xpath("//select[@id='cardType']")).sendKeys("Visa");
		driver.findElement(By.id("maskedCardNo")).sendKeys("4111111111111111");
		driver.findElement(By.id("expDateMonth")).sendKeys("test@fis.com");
		driver.findElement(By.id("expDateMonth")).sendKeys("02");		
		driver.findElement(By.id("expDateYear")).sendKeys("2019");
		driver.findElement(By.id("csc")).sendKeys("123");
		
		
		driver.findElement(By.id("submitShippingPaymetButton")).click();
				
		System.out.println("                Review Order page");
		
		List<WebElement> link11=driver.findElements(By.xpath("//div[@id='top-links']/a"));
		System.out.println(link11.size());
		a=link11.size();

		if(a!=0){
			for (int j = 1; j <=a; j++) {
				if(j==1)
				{
										
				}
				else
				{
					String linkname=driver.findElement(By.xpath("//div[@id='top-links']/a["+j+"]")).getText();
					System.out.println(linkname);
					driver.findElement(By.xpath("//div[@id='top-links']/a["+j+"]")).click();
					Set<String> se=driver.getWindowHandles();
					for (String str : se) {	
						//System.out.println(str);
						if(str.contentEquals(primarywindow))
						{

						}
						else
						{
							driver.switchTo().window(str);			
							System.out.println(driver.getCurrentUrl());			
							driver.switchTo().window(str).close();
							driver.switchTo().window(primarywindow);
						}
					}
				}

			}
		}
		
		
		driver.findElement(By.id("termsConditions")).click();
		
		driver.findElement(By.xpath("//form[@id='mainForm']/div[3]/p/input")).click();
		
		System.out.println("                Order Confirmation");
		
		System.out.println(driver.findElement(By.className("success")).getText());
		//System.out.println(driver.findElement(By.xpath("//div[@id='middle-column']/div/div[3]/p")).getText());
		
		
		List<WebElement> link111=driver.findElements(By.xpath("//div[@id='top-links']/a"));
		System.out.println(link111.size());
		a=link111.size();

		if(a!=0){
			for (int j = 1; j <=a; j++) {
				if(j==1)
				{
									
				}
				else
				{
					String linkname=driver.findElement(By.xpath("//div[@id='top-links']/a["+j+"]")).getText();
					System.out.println(linkname);
					driver.findElement(By.xpath("//div[@id='top-links']/a["+j+"]")).click();
					Set<String> se=driver.getWindowHandles();
					for (String str : se) {	
						//System.out.println(str);
						if(str.contentEquals(primarywindow))
						{

						}
						else
						{
							driver.switchTo().window(str);			
							System.out.println(driver.getCurrentUrl());			
							driver.switchTo().window(str).close();
							driver.switchTo().window(primarywindow);
						}
					}
				}

			}
		}



	}








	private static void linktest() {
		// TODO Auto-generated method stub

		List<WebElement> link=driver.findElements(By.xpath("//div[@id='top-links']/a"));
		System.out.println(link.size());
		a=link.size();

		if(a!=0){
			for (int j = 1; j <=a; j++) {
				if(j==1)
				{
					String linkname=driver.findElement(By.xpath("//div[@id='top-links']/a["+j+"]")).getText();
					System.out.println(linkname);
					driver.findElement(By.xpath("//div[@id='top-links']/a["+j+"]")).click();
					System.out.println(driver.getCurrentUrl());					
				}
				else
				{
					String linkname=driver.findElement(By.xpath("//div[@id='top-links']/a["+j+"]")).getText();
					System.out.println(linkname);
					driver.findElement(By.xpath("//div[@id='top-links']/a["+j+"]")).click();
					Set<String> se=driver.getWindowHandles();
					for (String str : se) {	
						//System.out.println(str);
						if(str.contentEquals(primarywindow))
						{

						}
						else
						{
							driver.switchTo().window(str);			
							System.out.println(driver.getCurrentUrl());			
							driver.switchTo().window(str).close();
							driver.switchTo().window(primarywindow);
						}
					}
				}

			}
		}



	}
}
