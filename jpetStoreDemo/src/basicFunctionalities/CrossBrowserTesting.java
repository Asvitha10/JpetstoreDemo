package basicFunctionalities;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import mainModules.Login;

public class CrossBrowserTesting {
	public static void main(String[] args) throws InterruptedException 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1 for GoogleChrome.\nEnter 2 for MSEdge.\nEnter 3 for MozillaFire.");
		int input=s.nextInt();
		
		WebDriver driver = null;
		
		switch(input)
		{
		case 1:
			System.out.println("***GoogleChrome***");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\AUTOMATION\\Browser Extension\\chromedriver.exe");
			driver=new ChromeDriver();
			break;
			
		case 2:
			System.out.println("***MSEdge***");
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Downloads\\AUTOMATION\\Browser Extension\\edgedriver.exe");
			driver=new EdgeDriver();
			break;
			
		case 3:
			System.out.println("***Firefox***");
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\AUTOMATION\\Browser Extension\\geckodriver.exe");
			driver=new FirefoxDriver();
			break;
			
		default: System.out.println("Invalid input.");
		}
		//Create object
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
