package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import com.Zerodha.POMClass.LoginPOMClass;

public class TestBaseClass {
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\cromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");

		// Upcasting
		driver = new ChromeDriver();
		System.out.println("browser is opened");

		driver.manage().window().maximize();
		System.out.println("browser is maximized");

		// 1. get() method use to open the URL
		driver.get("https://kite.zerodha.com/"); // Given URL

		System.out.println("KiteZerodha open webside");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Thread.sleep(2000);
		
		
		WebElement userid = driver.findElement(By.xpath("//input[@id='userid']"));

		userid.sendKeys("QSY032");
		System.out.println("userID is entered");

		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));

		password.sendKeys("pallavi88@123");
		System.out.println("Password is entered");

		WebElement loginButton = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		
		
		loginButton.click();
		
		System.out.println("login button  is succesfully click");
		
		
		LoginPOMClass lp = new LoginPOMClass(driver);
		Thread.sleep(15000);
		lp.clickOnContinueButton();
		
	}
	
	

}
