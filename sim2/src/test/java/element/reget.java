package element;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import Objrep.travellogin;

public class reget {
		@Test
	public void Login() throws InterruptedException
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver;
			 driver=new ChromeDriver();
			driver.get("https://phptravels.org/register.php");
			driver.manage().window().maximize();
			Thread.sleep(4000);
			
			travellogin.first_name(driver).sendKeys("kiran");
			travellogin.last_name(driver).sendKeys("pansare");
	       travellogin.e_mail(driver).sendKeys("kpansare23@gmail.com");
			travellogin.phone_no(driver).sendKeys("9011346385");
			travellogin.company_name(driver).sendKeys("HCL");
			travellogin.street_adress(driver).sendKeys("srno 4");
			travellogin.street_adress2(driver).sendKeys("aanadpark");
			travellogin.city(driver).sendKeys("pune");
			travellogin.state(driver).sendKeys("Maharastra");
			travellogin.post_code(driver).sendKeys("411016");
			travellogin.country(driver);
			travellogin.mobile_no(driver).sendKeys("9011346385");
			travellogin.password(driver).sendKeys("kiran@23");
			travellogin.confirm_password(driver).sendKeys("kiran@23");
			((JavascriptExecutor)driver).executeScript("scroll(0,1200)");
			Thread.sleep(3000);
			travellogin.register(driver).click();
			
			}
		
		
	}




