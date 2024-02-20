package TestNG;

import org.testng.annotations.Test;

import mainModules.Login;

import org.testng.annotations.BeforeTest;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class AddToCartJPetstore {
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
  public void addtocart() throws InterruptedException
  {
	  Login l= new Login();
		l.url(driver);
		l.maximize(driver);
		l.deleteAllCookies(driver);
		Thread.sleep(2000);
		l.Signin(driver);
		Thread.sleep(2000);
		l.username(driver, "ragul");
		Thread.sleep(2000);
		l.password1(driver, "admin1");
		Thread.sleep(2000);
		l.login(driver);
		Thread.sleep(2000);
		
	   //Fish
		driver.findElement(By.linkText("Fish")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='FI-SW-01']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='EST-1']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@class='button']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Return to FI-SW-01']")).click();
		driver.findElement(By.linkText("Return to FISH")).click();
		driver.findElement(By.linkText("Return to Main Menu")).click();        
		
		//Dog
		driver.findElement(By.xpath("//div[@id='SidebarContent']//a[normalize-space()='Dogs']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='K9-DL-01']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='EST-9']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Return to Main Menu")).click();
		
		//Cats
		driver.findElement(By.xpath("//div[@id='SidebarContent']//a[normalize-space()='Cats']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[2]/td[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='EST-14']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Return to Main Menu")).click();
		
		//Reptiles
		driver.findElement(By.xpath("//div[@id='SidebarContent']//a[normalize-space()='Reptiles']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='RP-SN-01']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='EST-11']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Return to Main Menu")).click();    
		
		//Birds
		driver.findElement(By.xpath("//div[@id='SidebarContent']//a[normalize-space()='Birds']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='AV-CB-01']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='EST-18']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Return to Main Menu")).click();   
		
		//Cart
		driver.findElement(By.xpath("//img[@name='img_cart']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Update Cart']")).click();
		driver.findElement(By.xpath("//input[@name='EST-9']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[2]/td[8]/a[1]")).click();   
		Thread.sleep(2000);
		driver.findElement(By.xpath(" //*[@id=\"Cart\"]/a")).click();
		Thread.sleep(2000);
		l.username(driver, "ragul");
		Thread.sleep(2000);
		l.password1(driver, "admin");
		Thread.sleep(2000);
		l.login(driver);
		Thread.sleep(6000);
		
		//Payment Details
		Select s= new Select(driver.findElement(By.xpath("//select[@name='cardType']")));
		s.selectByIndex(1);
		Thread.sleep(2000);
		String cNo= JOptionPane.showInputDialog("Enter CardNumber");
      driver.findElement(By.xpath("//input[@name='creditCard']")).clear();
      driver.findElement(By.xpath("//input[@name='creditCard']")).sendKeys(cNo);
      Thread.sleep(2000);
      

		String expiryDate= JOptionPane.showInputDialog("Enter ExpiryDate");
      driver.findElement(By.xpath("//input[@name='expiryDate']")).clear();
      driver.findElement(By.xpath("//input[@name='expiryDate']")).sendKeys(expiryDate);
      Thread.sleep(2000);
      
       //Billing Address
		driver.findElement(By.xpath("//input[@name='shippingAddressRequired']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Confirm']")).click();
		Thread.sleep(2000);
      driver.findElement(By.xpath("//button[@type='button']")).click();
	}
  
 

  @AfterTest
  public void afterTest()
  {
	  driver.close();
  }

}
