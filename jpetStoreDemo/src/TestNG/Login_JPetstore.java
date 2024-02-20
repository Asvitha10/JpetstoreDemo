package TestNG;

import org.testng.annotations.Test;

import mainModules.Login;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Login_JPetstore {
	WebDriver driver;
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admins\\Downloads\\AUTOMATION\\Browser Extension\\chromedriver.exe");
	  driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
  }
  @Test(description="Parallel Testing")
  public void login() throws InterruptedException
  {
	  Login l= new Login();
	    l.url(driver);
		l.maximize(driver);
		l.deleteAllCookies(driver);
		Thread.sleep(2000);
		l.Signin(driver);
		l.username(driver,"ragul");
		Thread.sleep(2000);
		l.password1(driver,"admin");
		Thread.sleep(2000);
		l.login(driver);
  }
 

  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}
