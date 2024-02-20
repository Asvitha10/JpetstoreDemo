package FrameWorks;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class JPetStore_KDT_OperationalClass {
	Select s;
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
	
	public void Signup(WebDriver driver)
	{
		driver.findElement(By.xpath("//a[normalize-space()='Sign Up']")).click();
	}
	public void userinformation(WebDriver driver, String a)
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(a);
	}
	public void userinformation1(WebDriver driver, String b)
	{
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(b);
	}
	public void userinformation2(WebDriver driver, String c)
	{
		driver.findElement(By.xpath("//input[@name='repeatedPassword']")).sendKeys(c);
	}
	public void accountinformation(WebDriver driver, String m)
	{
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(m);
	}
	public void accountinformation1(WebDriver driver, String d)
	{
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(d);
	}
	public void accountinformation2(WebDriver driver, String e)
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(e);
	}
	public void accountinformation3(WebDriver driver, String ph)
	{
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(ph);
	}
	public void accountinformation4(WebDriver driver, String g)
	{
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(g);
	}
	public void accountinformation5(WebDriver driver, String h)
	{
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys(h);
	}
	public void accountinformation6(WebDriver driver, String i)
	{
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(i);
	}
	public void accountinformation7(WebDriver driver, String j)
	{
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys(j);
	}
	public void accountinformation8(WebDriver driver, String k)
	{
		driver.findElement(By.xpath("//input[@name='zip']")).sendKeys(k);
	}
	public void accountinformation9(WebDriver driver, String l)
	{
		driver.findElement(By.xpath("//input[@name='country']")).sendKeys(l);
	}
	public void Signin(WebDriver driver)
	{
		driver.findElement(By.xpath("//a[normalize-space()='Sign In']")).click();
	}
	
	
	public void profileinformation(WebDriver driver)
	{
		s= new Select(driver.findElement(By.xpath("//select[@name='languagePreference']")));
		s.selectByIndex(1);
		s= new Select(driver.findElement(By.xpath("//select[@name='favouriteCategoryId']")));
		s.selectByIndex(0);
	}
	public void profileinformation1(WebDriver driver)
	{
		driver.findElement(By.xpath("//input[@name='listOption']")).click();
		driver.findElement(By.xpath("//input[@name='bannerOption']")).click();
	}
	
	public void registerbutton(WebDriver driver)
	{
		driver.findElement(By.xpath("//button[normalize-space()='Save Account Information']")).click();
	}
	
	//login
	    public void signin(WebDriver driver)
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
		public void login(WebDriver driver) throws InterruptedException
		{
			driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
			Thread.sleep(2000);
		}
		
		//ADD TO CART
		public void addToCart(WebDriver driver) throws InterruptedException
		{
			//Fish
			Thread.sleep(6000);
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
			//login
			/*driver.findElement(By.xpath("//input[@name='username']")).clear();
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ragul");
			driver.findElement(By.xpath("//input[@name='password']")).clear();
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
			driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
			Thread.sleep(6000);*/
			//Payment Details
			
			Select s= new Select(driver.findElement(By.xpath("//select[@name='cardType']")));
			s.selectByIndex(1);
			Thread.sleep(2000);
			String cNo= JOptionPane.showInputDialog("Enter CardNumber");
			 Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@name='creditCard']")).clear();
	        driver.findElement(By.xpath("//input[@name='creditCard']")).sendKeys(cNo);
	        Thread.sleep(4000);
	        

			String expiryDate= JOptionPane.showInputDialog("Enter ExpiryDate");
	        driver.findElement(By.xpath("//input[@name='expiryDate']")).clear();
	        driver.findElement(By.xpath("//input[@name='expiryDate']")).sendKeys(expiryDate);
	        Thread.sleep(2000);
	        
	         //Billing Address
			driver.findElement(By.xpath("//input[@name='shippingAddressRequired']")).click();
			 Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
			 Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
			 Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Confirm']")).click();
			Thread.sleep(2000);
	        driver.findElement(By.xpath("//button[@type='button']")).click();
		}

			
			
		
		//searchBox
		
		public void searchBox(WebDriver driver) throws InterruptedException
		{
			driver.get("https://jpetstore.aspectran.com/catalog/");
			   
			   driver.findElement(By.xpath("//input[@placeholder='Product Search']")).click();
				driver.findElement(By.xpath("//input[@placeholder='Product Search']")).sendKeys("Dogs");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
				driver.findElement(By.xpath("//a[normalize-space()='Return to Main Menu']")).click();
				Thread.sleep(6000);
		}
		
		public void Myorders(WebDriver driver) throws InterruptedException
		
		{
			
			driver.findElement(By.linkText("Fish")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[normalize-space()='FI-SW-01']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[normalize-space()='EST-1']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class='button']")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Return to Main Menu")).click();
			Thread.sleep(4000);
			
			//My Orders
			driver.findElement(By.xpath("//a[normalize-space()='My Orders']")).click();
			driver.navigate().back();
			Thread.sleep(4000);
			
			//My Accounts
			driver.findElement(By.xpath("//a[normalize-space()='My Account']")).click();
			String newpassword = JOptionPane.showInputDialog("Enter NewPassword");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(newpassword);
	        Thread.sleep(1000);
			String confirmpassword = JOptionPane.showInputDialog("Enter ConfirmPassword");
			driver.findElement(By.xpath("//input[@name='repeatedPassword']")).sendKeys(confirmpassword);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[normalize-space()='Save Account Information']")).click();
		}
		
		public void signOut(WebDriver driver)
		{
			driver.findElement(By.xpath("//a[normalize-space()='Sign Out']")).click();
		}
		
		public void closeBrowser(WebDriver driver)
		{
			driver.close();


	}

}
