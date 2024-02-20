package FrameWorks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JPetStore_KDT_MainClass {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\AUTOMATION\\Browser Extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		JPetStore_KDT_ReadExcelClass r = new JPetStore_KDT_ReadExcelClass();
        r.readExcel(driver);
	}

}
