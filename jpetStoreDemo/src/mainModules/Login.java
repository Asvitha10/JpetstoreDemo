package mainModules;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Login {
	public void maximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void deleteAllCookies(WebDriver driver)
	{
		driver.manage().deleteAllCookies();
	}

	public void url(WebDriver driver)
	{
		driver.get("https://jpetstore.aspectran.com/catalog/");
	}
	public void Signin(WebDriver driver)
	{
		driver.findElement(By.xpath("//a[normalize-space()='Sign In']")).click();
	}
	
		public void username(WebDriver driver, String x)
		{
			driver.findElement(By.xpath("//input[@name='username']")).clear();
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(x);
		}
		public void password1(WebDriver driver, String y)
		{
			driver.findElement(By.xpath("//input[@name='password']")).clear();
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(y);
		}
		public void login(WebDriver driver)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		}

	}








