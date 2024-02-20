package mainModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_MainClass {

	public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\AUTOMATION\\Browser Extension\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			Login l= new Login();
		    l.url(driver);
			l.maximize(driver);
			l.deleteAllCookies(driver);
			Thread.sleep(2000);
			l.Signin(driver);
			l.username(driver, "ragul");
			l.password1(driver, "admin1");
			l.login(driver);
		}

	}



