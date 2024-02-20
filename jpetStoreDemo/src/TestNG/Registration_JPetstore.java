package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
public class Registration_JPetstore {
	 WebDriver driver;
	
  @BeforeTest
  public void beforeTest()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\AUTOMATION\\Browser Extension\\chromedriver.exe");
	  driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
  }
  @Test(description="Parallel Testing")
  public void registration() throws InterruptedException 
  {
	  Select s;
	  driver.get("https://jpetstore.aspectran.com/catalog/");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//a[normalize-space()='Sign Up']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ragul");
      driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin1");
      driver.findElement(By.xpath("//input[@name='repeatedPassword']")).sendKeys("admin1");
      driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("raguldev");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("s");
      driver.findElement(By.xpath("//input[@name='email']")).sendKeys("raguldev@gmail.com");
      driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("373858959");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("no. 2654, colony");
      driver.findElement(By.xpath("//input[@name='address2']")).sendKeys( "mariyaman kovil");
      driver.findElement(By.xpath("//input[@name='city']")).sendKeys( "Trichy");
	    driver.findElement(By.xpath("//input[@name='state']")).sendKeys( "Tamilnadu");
	    driver.findElement(By.xpath("//input[@name='zip']")).sendKeys("620056");
	    driver.findElement(By.xpath("//input[@name='country']")).sendKeys( "India");
	    Thread.sleep(2000);
	    s= new Select(driver.findElement(By.xpath("//select[@name='languagePreference']")));
		s.selectByIndex(1);
		Thread.sleep(2000);
		s= new Select(driver.findElement(By.xpath("//select[@name='favouriteCategoryId']")));
		s.selectByIndex(0);
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='listOption']")).click();
		driver.findElement(By.xpath("//input[@name='bannerOption']")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[normalize-space()='Save Account Information']")).click();
	    
  }
 

  @AfterTest
  public void afterTest()
  {
	    driver.close();
  }

}
