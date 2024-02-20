package mainModules;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyOrders {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\AUTOMATION\\Browser Extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		Login l= new Login();
		l.url(driver);
		l.maximize(driver);
		l.deleteAllCookies(driver);
		Thread.sleep(2000);
		l.Signin(driver);
		l.username(driver, "ragul");
		l.password1(driver, "admin");
		l.login(driver);
		
	   //Fish
		driver.findElement(By.linkText("Fish")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='FI-SW-01']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='EST-1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Return to Main Menu")).click();
		
		//My Orders
		driver.findElement(By.xpath("//a[normalize-space()='My Orders']")).click();
		driver.navigate().back();
		
		//My Accounts
		driver.findElement(By.xpath("//a[normalize-space()='My Account']")).click();
		String newpassword = JOptionPane.showInputDialog("Enter NewPassword");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(newpassword);
        Thread.sleep(1000);
		String confirmpassword = JOptionPane.showInputDialog("Enter ConfirmPassword");
		driver.findElement(By.xpath("//input[@name='repeatedPassword']")).sendKeys(confirmpassword);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Save Account Information']")).click();
		
		//Sign Out
		driver.findElement(By.xpath("//a[normalize-space()='Sign Out']")).click();
		
		

	}

}
