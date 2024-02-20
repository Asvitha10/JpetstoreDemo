package FrameWorks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import mainModules.Login;
import mainModules.Registration;


public class JPetStore_Login_DDT {

	public static void main(String[] args) throws Exception { {
			FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Downloads\\AUTOMATION\\POI\\JPetStore.xlsx");
			XSSFWorkbook w=new XSSFWorkbook(file);
			XSSFSheet s = w.getSheet("JPetStore_Login_DDT");
			
			int rowSize = s.getLastRowNum();
			System.out.println("No of credentials: "+rowSize);
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\AUTOMATION\\Browser Extension\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			
			Login l= new Login();
			
			for(int i=1;i<=rowSize;i++)
			{
				
				String uname=s.getRow(i).getCell(0).getStringCellValue();
				String pword=s.getRow(i).getCell(1).getStringCellValue();
				
				System.out.println(uname+"\t"+pword);
				try
				{
					
					l.url(driver);
					l.maximize(driver);
					l.deleteAllCookies(driver);
					Thread.sleep(2000);
					l.Signin(driver);
					l.username(driver,uname );
					l.password1(driver,pword);
					l.login(driver);
					
					System.out.println("Valid Credential");
					System.out.println("");
					s.getRow(i).createCell(2).setCellValue("valid credential");
				}
				catch(Exception e)
					{
					
					System.out.println("Invalid Credential");
					System.out.println("");
				    s.getRow(i).createCell(2).setCellValue("Invalid Credential");
			     }
				}
				FileOutputStream out = new FileOutputStream("C:\\Users\\Admin\\Downloads\\AUTOMATION\\POI\\JPetStore.xlsx");
				w.write(out);
				
				
				}
			

	}

}

