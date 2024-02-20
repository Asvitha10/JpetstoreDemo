package FrameWorks;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;


public class JPetStore_KDT_ReadExcelClass {
	public void readExcel(WebDriver driver) throws Exception
	{
	FileInputStream file= new FileInputStream("C:\\Users\\Admin\\Downloads\\AUTOMATION\\POI\\JPetStore.xlsx");
	XSSFWorkbook w= new XSSFWorkbook(file);
	XSSFSheet s = w.getSheet("Login_KDT");
	
	int rowsize = s.getLastRowNum();
	System.out.println("No of Keywords: "+rowsize);      
	
	JPetStore_KDT_OperationalClass jp = new JPetStore_KDT_OperationalClass();
	
	 for(int i=1;i<=rowsize;i++)
	 {
		 String key = s.getRow(i).getCell(0).getStringCellValue();
		 System.out.println(key);
		 if(key.equals("OpenApplication"))
		 {
			 jp.url(driver);
		 }
		 else if(key.equals("ClickonSignUp"))
		 		
		 {
			 jp.Signup(driver);
		 }
		 else if(key.equals("EnterUser ID"))
		 		
			{
			 jp.userinformation(driver, "Ragul");
				Thread.sleep(2000);
			}
		 else if(key.equals("EnterNew password"))
		 		
			{
			 jp.userinformation1(driver, "admin123");
				Thread.sleep(2000);
			}
		 else if(key.equals("EnterConfirm password"))
		    {
			 jp.userinformation2(driver, "admin123");
				Thread.sleep(2000);
			}
		 else if(key.equals("EnterFirst name"))
		 		{
			 jp.accountinformation(driver, "raguldevkumar");
				Thread.sleep(2000);
			}
		 else if(key.equals("EnterLast name"))
	 		{
			 jp.accountinformation1(driver, "s");
			Thread.sleep(2000);
		    }
		 else if(key.equals("EnterEmail"))
	 		{
			 jp.accountinformation2(driver, "raguldev123@gmail.com");
			Thread.sleep(2000);
		    }
		 else if(key.equals("EnterPhone"))
	 		{
			 jp.accountinformation3(driver, "3737668959");
			Thread.sleep(2000);
		    }
		 else if(key.equals("EnterAddress1"))
	 		{
			 jp.accountinformation4(driver, "no. 2654, colony");
			Thread.sleep(2000);
		    }
		 else if(key.equals("EnterAddress 2"))
	 		{
			 jp.accountinformation5(driver, "mariyaman kovil");
			Thread.sleep(2000);
		    }
		 else if(key.equals("EnterCity"))
	 		{
			 jp.accountinformation6(driver, "Trichy");
			Thread.sleep(2000);
		    }
		 else if(key.equals("EnterState"))
	 		{
			 jp.accountinformation7(driver, "Tamilnadu");
			Thread.sleep(2000);
		    }
		 else if(key.equals("EnterZip"))
	 		{
			 jp.accountinformation8(driver, "620056");
			Thread.sleep(2000);
		    }
		 else if(key.equals("EnterCountry"))
	 		{
			 jp.accountinformation9(driver, "India");
			Thread.sleep(2000);
		    }
		 else if(key.equals("ClickonLanguage Preference"))
	 		{
			 jp.profileinformation(driver);
			Thread.sleep(2000);
		    }
		 
		 else if(key.equals("Enable MyList"))
	 		{
			 jp.profileinformation1(driver);
			Thread.sleep(2000);
		    }
		 else if(key.equals("Clickonsaveaccountinformation"))
	 		{
			 jp. registerbutton(driver);
			Thread.sleep(2000);        
		    }                                 
		 else if (key.equals("Signin"))
		 {
			 jp.signin(driver);
			 Thread.sleep(2000);
		 }
		 else if(key.equals("Username"))         
			{
				jp.username(driver, "Ragul");
				Thread.sleep(2000);
			}
		
		else if(key.equals("Password"))
		{
			jp.password1(driver, "admin23");
		}
		
		else if(key.equals("ClickOnLoginButton"))
		{
			jp.login(driver);
			Thread.sleep(2000);
		}
		else if(key.equals("ClickOnSignout"))
		{
			jp.signOut(driver);
		}
		else if (key.equals("CloseBrowser"))
				{
			jp.closeBrowser(driver);
				}

}
}
}