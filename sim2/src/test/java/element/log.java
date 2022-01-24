package element;


	

	import java.awt.AWTException;

	import java.io.IOException;

	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	
import Objrep.travellogin;

public class log {
		@Test
	public void Log() throws InterruptedException, AWTException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		 driver=new ChromeDriver();
		driver.get("https://phptravels.org/login");
		driver.manage().window().maximize();
		
		
		travellogin.EmailId(driver).sendKeys("kpansare23@gmail.com");
		travellogin.Password(driver).sendKeys("kiran@23");
		
		
		
		
		((JavascriptExecutor)driver).executeScript("scroll(0,200)");
		Thread.sleep(20000);
		
		travellogin.Login(driver).click();
		
	}
	}



