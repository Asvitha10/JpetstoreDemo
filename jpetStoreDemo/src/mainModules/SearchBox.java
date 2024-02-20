package mainModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBox {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\AUTOMATION\\Browser Extension\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   
		   driver.get("https://jpetstore.aspectran.com/catalog/");
		   
		   driver.findElement(By.xpath("//input[@placeholder='Product Search']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Product Search']")).sendKeys("Dogs");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
			driver.findElement(By.xpath("//a[normalize-space()='Return to Main Menu']")).click();

	}

}
