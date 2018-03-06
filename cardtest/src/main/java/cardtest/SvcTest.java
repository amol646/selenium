package cardtest;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SvcTest {

	public static void main(String[] args) throws InterruptedException, WebDriverException, IOException {

		WebDriver driver;

		//Chromedriver enbled here
		//System.setProperty("webdriver.chrome.driver", "C:/Users/e3020651/Downloads/chromedriver.exe");
		//driver=new ChromeDriver();

		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		//cap.setVersion("ANY");
		URL url=new URL("http://localhost:4444/wd/hub");
		driver=new RemoteWebDriver(url,cap);
		//IE driver enabled here
		/*
		System.setProperty("webdriver.ie.driver", "C:/Users/e3020651/Downloads/IEDriverServer.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		capabilities.setCapability("requireWindowFocus", true);
		driver=new InternetExplorerDriver(capabilities);
		 */
		driver.manage().window().maximize();
		driver.get("https://readiness.efdservices.com/main/cmse/Login");
		//driver.get("http://d05jbweb02.metavante.com:5082/main/cmse/home");

		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.findElement(By.id("userid")).sendKeys("w548984");
		driver.findElement(By.id("password")).sendKeys("Month#02");
		driver.findElement(By.xpath("//input[@id='loginButton']")).click();
		//Thread.sleep(1000);
		//4411250000005567
		driver.findElement(By.id("inst")).clear();
		driver.findElement(By.id("inst")).sendKeys("548");
		driver.findElement(By.id("maskedCardNumber")).sendKeys("4001730000000748");
		driver.findElement(By.id("searchSubmit")).click();
		//Thread.sleep(1000);

		driver.findElement(By.xpath("//a[@id='PrepaidDebit']")).click();
		//Thread.sleep(100);
		driver.findElement(By.linkText("Statements")).click();
		//driver.findElement(By.xpath("//li[@id='StatementsList']/a")).click();

		driver.findElement(By.xpath("//*[@id='StatementsList']/div[3]/div/span")).click();

		driver.findElement(By.linkText("December 2017")).click();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE) , new File("E:/Statementcheckflowscreenshot/test.jpg"));

		int a=driver.findElements(By.xpath("//div[@id='main-column']/div/div/div[4]/div")).size();
		System.out.println(a);
		String b[] = new String[a+2];

		try {
			for(int i=2;i<=a;i++)
			{
				//4- if card trasnaction are present
				// 3- if card transaction not present

				//li = 4 for card hleve in SSI and li=5 for account level in SSI
				System.out.println(driver.findElement(By.xpath("//div[@id='main-column']/div/div/div[4]/div["+i+"]/ul/li[4]")).getText());
				b[i]=driver.findElement(By.xpath("//div[@id='main-column']/div/div/div[4]/div["+i+"]/ul/li[4]")).getText();
			}

			//System.out.print("-----------------------------");
			float sum = 0;
			for(int j=2;j<=a;j++)
			{
				b[j]=b[j].replaceAll("\\s","");
				//System.out.print("-----------------------------");
				System.out.println(b[j]=b[j].substring(1));
				float sum1=Float.parseFloat((b[j]));
				sum=sum+sum1;
				//System.out.println(sum);
			}

			System.out.println("Added periodic fee (logic) "+sum);

			System.out.println("Total Fees for This Period (from statement page)  " + driver.findElement(By.xpath("//div[@id='balance']/table/tbody/tr/td[2]")).getText());


		} catch (Exception e) {
			// TODO: handle exception
			driver.close();
		}



	}

}
