package basicFunctionalities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmokeTesting {

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\AUTOMATION\\Browser Extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://jpetstore.aspectran.com/catalog/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Sign In']")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Sign Up']")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Product Search']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Product Search']")).sendKeys("Cats");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
			
		
		driver.findElement(By.xpath("//div[@class='cell']//a[normalize-space()='Demo Apps']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@id='SidebarContent']//a[normalize-space()='Fish']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@id='SidebarContent']//a[normalize-space()='Dogs']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@id='SidebarContent']//a[normalize-space()='Cats']")).click();
		Thread.sleep(2000);
		driver.navigate().back();            
		
		driver.findElement(By.xpath("//div[@id='SidebarContent']//a[normalize-space()='Reptiles']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@id='SidebarContent']//a[normalize-space()='Birds']")).click();
		Thread.sleep(2000);
		driver.navigate().back();  
		
		driver.findElement(By.xpath("//area[@coords='72,2,280,250']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		//fish
		driver.findElement(By.xpath("//area[@coords='2,180,72,250']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		//cat
		driver.findElement(By.xpath("//area[@coords='225,240,295,310']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		//dog
		driver.findElement(By.xpath("//area[@coords='60,250,130,320']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		//Reptiles
		driver.findElement(By.xpath("//area[@coords='140,270,210,340']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		//Birds
		driver.findElement(By.xpath("//area[@coords='280,180,350,250']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//img[@name='img_cart']")).click();
		
		driver.close();
		
	}

}


