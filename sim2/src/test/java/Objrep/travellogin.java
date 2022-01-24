package Objrep;



	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;

	public class travellogin 
	{
		public  static WebElement first_name(WebDriver driver)
		{
			return driver.findElement(By.id("inputFirstName"));
		}
		public static WebElement last_name(WebDriver driver)
		{
			return driver.findElement(By.id("inputLastName"));
		}
		public static WebElement e_mail(WebDriver driver)
		{
			return driver.findElement(By.id("inputEmail"));
	}
		public static WebElement phone_no(WebDriver driver)
		{
			return driver.findElement(By.id("inputPhone"));
	}
		public static WebElement company_name(WebDriver driver)
		{
			return driver.findElement(By.id("inputCompanyName"));
	}
		public static WebElement street_adress(WebDriver driver)
		{
			return driver.findElement(By.id("inputAddress1"));
			}

		public static WebElement street_adress2(WebDriver driver)
		{
			return driver.findElement(By.id("inputAddress2"));
			}
		public static WebElement city(WebDriver driver)
		{
			return driver.findElement(By.id("inputCity"));
			}
		public static WebElement state(WebDriver driver)
		{
			return driver.findElement(By.id("stateinput"));
			}
		public static WebElement post_code(WebDriver driver)
		{
			return driver.findElement(By.id("inputPostcode"));
			}
		public static WebElement country(WebDriver driver)
		{
			Select s2=new Select(driver.findElement(By.id("inputCountry")));
			s2.selectByValue("IN");
			return null;
		}
		public static WebElement mobile_no(WebDriver driver)
		{
			return driver.findElement(By.id("customfield2"));
			}
		public static WebElement password(WebDriver driver)
		{
			return driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div[1]/form/div[2]/div/div[2]/div/div[1]/input"));
			}
		public static WebElement confirm_password(WebDriver driver)
		{
		return driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div[1]/form/div[2]/div/div[3]/div/input"));
		}
		
		public static WebElement register(WebDriver driver)
		{
			return driver.findElement(By.xpath("*//input[@value='Register']"));
		}
		
		public WebElement captcha(WebDriver driver)
		{
			return driver.findElement(By.id("recaptcha-anchor-label"));
			
		}
		public static WebElement EmailId(WebDriver driver)
		{
			
		return driver.findElement(By.xpath("//*[@id=\"inputEmail\"]"));

		}
		public static WebElement Password(WebDriver driver)
		{
			
		return driver.findElement(By.name("password"));
		}
		
		public static WebElement Login(WebDriver driver)
		{
		return driver.findElement(By.id("login"));
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		

	
	

