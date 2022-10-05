package com.firebase.test.tests;

import java.io.File;
import org.testng.Assert;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
//import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


import com.firebase.test.utility.CommonUtilities;
import com.firsebase.test.base.BaseClass;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class AutomationTest extends BaseClass{

	
		// TODO Auto-generated method stub
        

   @Test
       public static void loginErrorMessage()throws InterruptedException, IOException   {
	   
		 CommonUtilities CU = new CommonUtilities();
	        Properties applicationPropertiesFile = CU.loadfile("applicationProperties");
		//String url = CU.getApplicationProperty("url",applicationPropertiesFile);
		String usrname = CU.getApplicationProperty("usrname",applicationPropertiesFile);
		CU.getApplicationProperty("passwrd",applicationPropertiesFile);
	    //getdriver("browsername");
		//goToUrl(url);
		//waitUntilPageLoads();
		System.out.println("Inside loginErrorMessage test case");
		WebElement username = driver.findElement(By.id("username"));
         waitUntilVisible(username,"username");
		enterText(username,usrname,"user name");
		WebElement password = driver.findElement(By.id("password"));
		clearElement(password,"password Field");
		WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		waitUntilVisible(loginbutton,"Loginbutton");
	    clickElement(loginbutton,"login button");
	   report.logTestInfo("testscript execution completed");
    		
    		
    		}
 
	

	@Test
    public static void loginToSalesforce1()throws InterruptedException, IOException   {
		  
    loginToSalesforceMethod();
    	
    }	
      @Test
public static void checkRememberMe3()throws InterruptedException, IOException   {
	

	loginToSalesforceMethod();
	WebElement shradha= driver.findElement(By.id("userNav"));
	clickElement(shradha,"shradha");
	WebElement logout = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
	waitUntilVisible(logout,"logout");
	System.out.println("Inside checkRememberMe3");
	clickElement(logout,"log out");
	
	
	
}	
      @Test
public static void ForgotPassword4A( )throws InterruptedException, IOException   {

	CommonUtilities CU = new CommonUtilities();
    Properties applicationPropertiesFile = CU.loadfile("applicationProperties");
	//String url = CU.getApplicationProperty("url",applicationPropertiesFile);
	String usrname = CU.getApplicationProperty("usrname",applicationPropertiesFile);
	//String passwrd = CU.getApplicationProperty("passwrd",applicationPropertiesFile);
	//goToUrl(url);
	//waitUntilPageLoads();
	WebElement forgotpassword = driver.findElement(By.id("forgot_password_link"));
    forgotpassword.click();
    waitUntilVisible(forgotpassword,"forgotpassword");
    System.out.println("Inside ForgotPassword4A");
    WebElement username = driver.findElement(By.xpath("//*[@id=\"un\"]"));
 	username.clear();
 	username.sendKeys(usrname);
 	waitUntilVisible(username,"username");
 	WebElement continueb = driver.findElement(By.id("continue"));
 	continueb.click();
 	waitUntilVisible(continueb,"continueb");
 	
 	
 		
 	
     
}
     @Test
public static void ForgotPassword4B()throws InterruptedException, IOException   {
    	CommonUtilities CU = new CommonUtilities();
	    Properties applicationPropertiesFile = CU.loadfile("applicationProperties");
		//String url = CU.getApplicationProperty("url",applicationPropertiesFile);
		String usrname = CU.getApplicationProperty("usrname",applicationPropertiesFile);
		String invalid_passwrd = CU.getApplicationProperty("invalid-passwrd",applicationPropertiesFile);
	WebElement username = driver.findElement(By.id("username"));
	waitUntilVisible(username,"username");
	enterText(username,usrname,"user name");
	WebElement password = driver.findElement(By.id("password"));
	waitUntilVisible(password,"password");
	clearElement(password, "password");
	password.sendKeys(invalid_passwrd);
	WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"Login\"]"));
    clickElement(loginbutton,"loginbutton");
    waitUntilVisible(loginbutton,"loginbutton");
    
     }
    
     @Test
 public static void chromeTC05() throws IOException, InterruptedException {
	 
	

	    
		loginToSalesforceMethod();
		WebElement shradha= driver.findElement(By.id("userNav"));
		System.out.println("Inside chromeTC05");
		clickElement(shradha,"shradha");
		waitUntilVisible(shradha,"shradha");	
		
		
 }	
      @Test	
public static void chromeTC06() throws IOException, InterruptedException {
	 
    	  CommonUtilities CU = new CommonUtilities();
  	    Properties applicationPropertiesFile = CU.loadfile("applicationProperties");
  	    CU.getApplicationProperty("post",applicationPropertiesFile);
  	    CU.getApplicationProperty("fname",applicationPropertiesFile);
  	    CU.getApplicationProperty("lname",applicationPropertiesFile);
		loginToSalesforceMethod();
	    //Go to My profile
		
	    WebElement shradha= driver.findElement(By.id("userNav"));
		clickElement(shradha,"shradha");
		waitUntilVisible(shradha,"shradha");
		WebElement myprofile = driver.findElement(By.xpath("//a[@title='My Profile']"));
		//Actions action = new Actions(driver);
		//action.moveToElement(myprofile).build().perform();
		Thread.sleep(2000);

		clickElement(myprofile,"my profile");
		Thread.sleep(4000);

		//Edit Profile
		System.out.println("Inside chromeTC06");
		WebElement editprofile = driver.findElement(By.xpath("//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a"));
		clickElement(editprofile,"edit profile");
		driver.switchTo().frame(2);
		Thread.sleep(2000);
		WebElement about = driver.findElement(By.xpath("//*[@id=\"aboutTab\"]/a"));
		clickElement(about,"About");
		WebElement finame = driver.findElement(By.id("firstName"));
		finame.clear();
		finame.sendKeys( CU.getApplicationProperty("fname",applicationPropertiesFile));
		WebElement laname= driver.findElement(By.id("lastName"));
		laname.clear();
		laname.sendKeys(CU.getApplicationProperty("lname",applicationPropertiesFile));
		WebElement saveAll = driver.findElements(By.className("zen-primaryBtn")).get(0);
		saveAll.click();

		//Send Post
		
		Thread.sleep(2000);
		WebElement post1 = driver.findElement(By.id("publisherAttachTextPost"));
		clickElement(post1,"post");
		driver.switchTo().frame(0);
		WebElement textArea = driver.findElements(By.className("chatterPublisherRTE")).get(0);
		textArea.click();
		textArea.sendKeys(CU.getApplicationProperty("post",applicationPropertiesFile));
		driver.switchTo().defaultContent();
		WebElement share = driver.findElement(By.id("publishersharebutton"));
		share.click();
		
		//Upload File
		
		WebElement File = driver.findElement(By.id("publisherAttachContentPost"));
		Thread.sleep(1000);
		clickElement(File,"File");
		waitUntilVisible(File,"File");
		WebElement upload = driver.findElement(By.id("chatterUploadFileAction"));
		waitUntilVisible(upload,"upload");
		upload.click();
		WebElement choose = driver.findElement(By.id("chatterFile"));
		waitUntilVisible(choose,"choose");
		File image = new File("C:\\Users\\shwet\\eclipse-workspace\\SeleniumAutomationProjects\\src\\test\\resources\\gg.jpg");
		choose.sendKeys(image.getAbsolutePath());
		WebElement shareFile = driver.findElement(By.id("publishersharebutton"));
		clickElement(shareFile, "Share");
		waitUntilVisible(shareFile,"Share");
		
		//Update profile pic
		
		WebElement pic = driver.findElements(By.className("chatter-photo")).get(0);
		Actions action = new Actions(driver);
		action.moveToElement(pic).build().perform();
		WebElement update = driver.findElement(By.id("uploadLink"));
		waitUntilVisible(update,"update");
		update.click();
		driver.switchTo().frame(1);
		WebElement picu = driver.findElements(By.className("fileInput")).get(0);
		picu.sendKeys("C:\\Users\\shwet\\eclipse-workspace\\SeleniumAutomationProjects\\src\\test\\resources\\gg.jpg");
		WebElement saven = driver.findElements(By.className("saveButton")).get(1);
		saven.click();
		waitUntilVisible(saven,"saven");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		saven = driver.findElements(By.className("saveButton")).get(0);
		saven.click();
		waitUntilVisible(saven,"saven");
		
		
}
      @Test
      public static void chromeTC07(String browsername) throws IOException, InterruptedException {
    		 
    	  CommonUtilities CU = new CommonUtilities();
    	    Properties applicationPropertiesFile = CU.loadfile("applicationProperties");
    		loginToSalesforceMethod();
    		WebElement username = driver.findElement(By.id("username"));
    		enterText(username,applicationPropertiesFile.getProperty("valid-username"),"user name");
    		WebElement password = driver.findElement(By.id("password"));
    		enterText(password,applicationPropertiesFile.getProperty("valid-password"),"pass word");
    	    WebElement rememberme = driver.findElement(By.name("rememberUn"));
    	    clickElement(rememberme,"remember me");
    		WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"Login\"]"));
    	    clickElement(loginbutton,"login button");
    		WebElement shradha= driver.findElement(By.id("userNav"));
    		clickElement(shradha,"shradha");
    		Thread.sleep(2000);
    		WebElement mysettings= driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[2]"));
    		clickElement(mysettings,"My settings");
    		WebElement personal= driver.findElement(By.id("PersonalInfo_font"));
    	    clickElement(personal, "Personal");
    	    Thread.sleep(2000);
    	    WebElement loginhistory= driver.findElement(By.id("LoginHistory_font"));
    	    clickElement(loginhistory, "Login History");
    	    Thread.sleep(1000);
    	    WebElement downloadhistory= driver.findElement(By.xpath("//*[@id=\"RelatedUserLoginHistoryList_body\"]/div/a"));
    	   // clickElement(downloadhistory,"Download History");
    	    WebElement personal1= driver.findElement(By.id("PersonalInfo_font"));
    	    clickElement(personal1, "Personal");
    	    Thread.sleep(6000);
    	   
    	    WebElement displaylayout= driver.findElements(By.className("setupFolder")).get(1);
    	    clickElement(displaylayout,"Display layout");
    	   Thread.sleep(2000);
    	    WebElement costomizeTabs = driver.findElement(By.id("CustomizeTabs_font"));
    	    Thread.sleep(1000);
    	clickElement(costomizeTabs, "customizetab");
    	    WebElement CustomApp = driver.findElement(By.id("p4"));
    	    Select select = new Select(CustomApp);
    	    select.selectByVisibleText("Salesforce Chatter");
    	    Thread.sleep(2000);

    	    Report();
    	   
    	    Thread.sleep(2500);
    	    WebElement email = driver.findElements(By.className("setupFolder")).get(2);
    	    clickElement(email,"Email");
    	    Thread.sleep(2000);
    	    WebElement myemailsetting = driver.findElement(By.id("EmailSettings_font"));
    	    clickElement(myemailsetting,"My EmailSettings");
    	    WebElement emailaddress = driver.findElement(By.id("CollaborationEmailSettings_font"));
    	    enterText(emailaddress,applicationPropertiesFile.getProperty("valid-Emailaddress"),"Email Address");
    		Thread.sleep(2000);
    	   driver.findElement(By.xpath("//input[@id='auto_bcc1']")).click();
    	   WebElement save1 = driver.findElement(By.xpath("//input[@title='Save']"));
    	   clickElement(save1,"save1");
    	   WebElement calenreminder = driver.findElements(By.className("setupFolder")).get(4);
    	   clickElement(calenreminder,"Calendar Reminder");
    	   Thread.sleep(2000);
    	   WebElement actireminders = driver.findElement(By.id("Reminders_font"));
    	   clickElement(actireminders,"Activity Reminders");
    	   Thread.sleep(2000);
    	   WebElement opetestremin = driver.findElement(By.id("testbtn"));
    	   clickElement(opetestremin,"open test reminder");
    	   closeBrowser();
    	   
    	}
      @Test
      public static void chromeTC08(String browsername) throws IOException, InterruptedException {
    		 
    		 
    	  CommonUtilities CU = new CommonUtilities();
  	    Properties applicationPropertiesFile = CU.loadfile("applicationProperties");
  		loginToSalesforceMethod();
    		WebElement username = driver.findElement(By.id("username"));
    		enterText(username,applicationPropertiesFile.getProperty("valid-username"),"user name");
    		WebElement password = driver.findElement(By.id("password"));
    		enterText(password,applicationPropertiesFile.getProperty("valid-password"),"pass word");
    	    WebElement rememberme = driver.findElement(By.name("rememberUn"));
    	    clickElement(rememberme,"remember me");
    		WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"Login\"]"));
    	    clickElement(loginbutton,"login button");
    		WebElement shradha= driver.findElement(By.id("userNav"));
    		clickElement(shradha,"shradha");
    		Thread.sleep(2000);
    	   WebElement developerconsole = driver.findElement(By.xpath("/html/body/div[1]/div[1]/table/tbody/tr/td[3]/div/div[3]/div/div/div[2]/div[3]/a[3]"));
    	   clickElement(developerconsole,"Developer Console");
    	   Thread.sleep(2000);
    	  // driver.switchTo().defaultContent();
    	  // driver.close();
    	   Iterator<String> it = driver.getWindowHandles().iterator();
    	   it.next();
    	   String bn = it.next();
    	   driver.switchTo().window(bn);
    	   Thread.sleep(2000);
    	   driver.close();
      }
    	@Test
    	public static void chromeTC10CreateAccount(String browsername) throws IOException, InterruptedException {
    		  CommonUtilities CU = new CommonUtilities();
    	  	    Properties applicationPropertiesFile = CU.loadfile("applicationProperties");
    	  		loginToSalesforceMethod();
    		 
    		//WebElement username = driver.findElement(By.id("username"));
    		//enterText(username,applicationPropertiesFile.getProperty("valid-username"),"user name");
    		//WebElement password = driver.findElement(By.id("password"));
    		//enterText(password,applicationPropertiesFile.getProperty("valid-password"),"pass word");
    	   // WebElement rememberme = driver.findElement(By.name("rememberUn"));
    	   // clickElement(rememberme,"remember me");
    		//WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"Login\"]"));
    	    //clickElement(loginbutton,"login button");
    		WebElement shradha= driver.findElement(By.id("userNav"));
    		clickElement(shradha,"shradha");
    		Thread.sleep(2000);
    	   WebElement accounts = driver.findElement(By.xpath("//a[@title ='Accounts Tab']"));
    	   clickElement(accounts,"Accounts");
    	   Thread.sleep(2000);
    		WebElement page = driver.findElement(By.id("tryLexDialogX")) ;  
    		clickElement(page,"Page");
    	   }

    	@Test
    	public static void chromeTC11CreateNewView(String browsername) throws IOException, InterruptedException {
    		 CommonUtilities CU = new CommonUtilities();
 	  	    Properties applicationPropertiesFile = CU.loadfile("applicationProperties");
 	  		loginToSalesforceMethod();
    			//WebElement username = driver.findElement(By.id("username"));
    			//enterText(username,applicationPropertiesFile.getProperty("valid-username"),"user name");
    			//WebElement password = driver.findElement(By.id("password"));
    			//enterText(password,applicationPropertiesFile.getProperty("valid-password"),"pass word");
    		    //WebElement rememberme = driver.findElement(By.name("rememberUn"));
    		   //WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"Login\"]"));
    		    //clickElement(loginbutton,"login button");
    			WebElement shradha= driver.findElement(By.id("userNav"));
    			clickElement(shradha,"shradha");
    			Thread.sleep(2000);

    		   WebElement accounts = driver.findElement(By.xpath("//a[@title ='Accounts Tab']"));
    		   clickElement(accounts,"Accounts");
    		   Thread.sleep(2000);
    		  
    			WebElement page = driver.findElement(By.id("tryLexDialogX")) ;  
    			clickElement(page,"Page");
    			
    			WebElement createnewview = driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[2]"));
    			clickElement(createnewview,"create new view");
    			Thread.sleep(2000);
    			WebElement viewname = driver.findElement(By.id("fname"));
    			enterText(viewname,applicationPropertiesFile.getProperty("viewname"),"View Name");
    			Thread.sleep(1000);
    			WebElement viewuniquename = driver.findElement(By.id("devname"));
    			clickElement(viewuniquename,"View unique Name");
    		   WebElement save = driver.findElement(By.name("save"));
    		   clickElement(save,"save");
    		   Thread.sleep(2000);
    		   closeBrowser();
    		   


    		}
@Test
    		public static void chromeTC12EditView(String browsername) throws IOException, InterruptedException {
    			 CommonUtilities CU = new CommonUtilities();
     	  	    Properties applicationPropertiesFile = CU.loadfile("applicationProperties");
     	  		loginToSalesforceMethod();
     		//WebElement username = driver.findElement(By.id("username"));
    			//enterText(username,applicationPropertiesFile.getProperty("valid-username"),"user name");
    			//enterText(password,applicationPropertiesFile.getProperty("valid-password"),"pass word");
    		   // WebElement rememberme = driver.findElement(By.name("rememberUn"));
    		   // clickElement(rememberme,"remember me");
    			// clickElement(loginbutton,"login button");
    			//WebElement shradha= driver.findElement(By.id("userNav"));
    			//clickElement(shradha,"shradha");
    			//Thread.sleep(2000);
    		   WebElement accounts = driver.findElement(By.xpath("//a[@title ='Accounts Tab']"));
    		   clickElement(accounts,"Accounts");
    		   Thread.sleep(2000);
    		  
    			WebElement page = driver.findElement(By.id("tryLexDialogX")) ;  
    			clickElement(page,"Page");
    			WebElement view = driver.findElement(By.name("fcf"));
    		    Select select = new Select(view);
    		    select.selectByVisibleText("newview");
    		    Thread.sleep(2000);
    		   WebElement edit = driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[1]"));
    		   clickElement(edit,"Edit");
    		   
    			WebElement viewname = driver.findElement(By.id("fname"));
    			enterText(viewname,applicationPropertiesFile.getProperty("viewname1"),"View Name");
    			Thread.sleep(1000);
    			WebElement viewuniquename = driver.findElement(By.id("devname"));
    			enterText(viewuniquename,applicationPropertiesFile.getProperty("viewuniquename1"),"View unique Name");
    			clickElement(viewuniquename,"View unique Name");
    			WebElement field = driver.findElement(By.id("fcol1"));
    		    field.click();
    			Select select1 = new Select(field);
    		    Thread.sleep(1000);
    		    //select.selectByVisibleText("Account Name");
    		    Thread.sleep(2000);
    		   



    		}
      @Test
      public static void mergeAccountsTC13() throws Exception{
      	CommonUtilities CU = new CommonUtilities();
      	Properties applicationPropertiesFile = CU.loadfile("applicationProperties");
      	loginToSalesforceMethod();
      	WebElement Account = driver.findElement(By.xpath("//*[@id=\"Account_Tab\"]/a"));
          clickElement(Account,"Account");
          Thread.sleep(1900);
          clickElement(driver.findElement(By.id("tryLexDialogX")),"X");
          WebElement merge = driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[2]/div/div/div/ul/li[4]/span/a"));
          merge.click();
          WebElement fText = driver.findElement(By.name("srch"));
          fText.sendKeys(applicationPropertiesFile.getProperty("Accountname"));
          WebElement find = driver.findElement(By.name("srchbutton"));
          find.click();
          WebElement next = driver.findElement(By.name("goNext"));
          next.click();
     
          WebElement mergeb = driver.findElement(By.name("save"));
          mergeb.click();
          driver.switchTo().alert().accept();

      }
      
      @Test
      public static void createAccountReportTC14() throws Exception{
      	CommonUtilities CU = new CommonUtilities();
      	Properties applicationPropertiesFile = CU.loadfile("applicationProperties");
      	loginToSalesforceMethod();
      	WebElement Account = driver.findElement(By.xpath("//*[@id=\"Account_Tab\"]/a"));
        clickElement(Account,"Account");
        Thread.sleep(1900);
        clickElement(driver.findElement(By.id("tryLexDialogX")),"X");
        WebElement accountsReport = driver.findElement(By.linkText("Accounts with last activity > 30 days")) ;
        clickElement(accountsReport,"Account Report");
        WebElement fromdate = driver.findElement(By.name("startDate"));
	    fromdate.clear();
	    fromdate.sendKeys(applicationPropertiesFile.getProperty("from"));
	    Thread.sleep(3000);
	    WebElement todate = driver.findElement(By.name("endDate"));
	    todate.clear();
	    todate.sendKeys(applicationPropertiesFile.getProperty("to"));
	    Thread.sleep(3000);
	    WebElement save = driver.findElement(By.id("ext-gen49"));
	    clickElement(save,"save");
	    Thread.sleep(2000);
	    WebElement reportname = driver.findElement(By.id("saveReportDlg_reportNameField"));
	    reportname.clear();
	    reportname.sendKeys(applicationPropertiesFile.getProperty("reportname"));
	    Thread.sleep(2000);
	    WebElement reportUniquename = driver.findElement(By.id("saveReportDlg_DeveloperName"));
	    reportUniquename.click();
	    Thread.sleep(2000);
	    WebElement SaveNRunReport = driver.findElement(By.xpath("//*[@id='dlgSaveAndRun']//em//button"));
        clickElement(SaveNRunReport,"Save and Run Report");
        Thread.sleep(4000);
        fullScreenshot();
      
      }  
      
      
      
      
      
      
      
      
      
      
      
      
      
   @Test
   
      
      public static void salesforceTC15() throws InterruptedException{
	   loginToSalesforceMethod();
	   waitUntilPageLoads();
	   
	   
	   WebElement oppurtunitylink = driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));
	   waitUntilVisible(oppurtunitylink ,"Oppurtunitylink ");
	   
	   clickElement(oppurtunitylink, "Oppurtunitylink");
	   clickElement(driver.findElement(By.id("tryLexDialogX")),"X");

	   Thread.sleep(5000);
	   WebElement view = driver.findElement(By.name("fcf"));
	   waitUntilVisible(view,"view");
	   
      }
   
   
   
   
   
   
   
   
   @Test
   
   
   public static void salesforceTC17() throws InterruptedException{
	   loginToSalesforceMethod();
	   waitUntilPageLoads();
	   
	   
	   WebElement oppurtunitylink = driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));
	   waitUntilVisible(oppurtunitylink ,"Oppurtunitylink ");
	   clickElement(oppurtunitylink, "Oppurtunitylink");
	   Thread.sleep(1400);
	   clickElement(driver.findElement(By.id("tryLexDialogX")),"X");

	   WebElement view = driver.findElement(By.name("fcf"));
	   waitUntilVisible(view,"view");
	   Select select = new Select(view);
	    select.selectByVisibleText("Opportunity Pipeline");
	    Thread.sleep(2000);
	   
   }
   
  @Test
  
     
     public static void salesforceTC18() throws InterruptedException, IOException{
	  try { 
	  loginToSalesforceMethod();
	   waitUntilPageLoads();
	   
	   
	   WebElement oppurtunitylink = driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));
	   waitUntilVisible(oppurtunitylink ,"Oppurtunitylink ");
	   clickElement(oppurtunitylink, "Oppurtunitylink");
	   Thread.sleep(5000);
	   WebElement stuckOppurtunity = driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[2]/a"));
	   clickElement(driver.findElement(By.id("tryLexDialogX")),"X");
	   screenshot(stuckOppurtunity);
   waitUntilVisible(stuckOppurtunity ,"Stuck opportunity ");
   clickElement(stuckOppurtunity, "Stuck opportunity");
	  }catch(Exception e)
	  {
		  fullScreenshot();
	  }
	  }
  @Test
  
  
  public static void salesforceTC19() throws InterruptedException{
	   loginToSalesforceMethod();
	   waitUntilPageLoads();
	   
	   
	   WebElement oppurtunitylink = driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));
	   waitUntilVisible(oppurtunitylink ,"Oppurtunitylink ");
	   clickElement(oppurtunitylink, "Oppurtunitylink");
	   Thread.sleep(1400);
	   clickElement(driver.findElement(By.id("tryLexDialogX")),"X");
	   WebElement interval = driver.findElement(By.id("quarter_q"));
	   waitUntilVisible(interval,"interval");
	   Select select = new Select(interval);
	    select.selectByVisibleText("Next FQ");
	    Thread.sleep(2000);
	    WebElement include = driver.findElement(By.id("open"));
	    waitUntilVisible(include,"include");
		Select select1 = new Select(include);
	    select1.selectByVisibleText("Closed Opportunities");
	    Thread.sleep(2000);
	    WebElement runreport = driver.findElement(By.name("go"));
	    clickElement(runreport, "runreport");
	    fullScreenshot();
	    
  }	
  @Test
  
  
  public static void salesforceTC20leadsTab() throws InterruptedException{
	   loginToSalesforceMethod();
	   WebElement leads = driver.findElement(By.id("Lead_Tab"));
	   clickElement(leads,"leads");
	   Thread.sleep(1400);
	   clickElement(driver.findElement(By.id("tryLexDialogX")),"X");
	   fullScreenshot();
	   
	   
  }
 @Test
  
  
  public static void salesforceTC21leadsTab() throws InterruptedException{
	   loginToSalesforceMethod();
	   WebElement leads = driver.findElement(By.id("Lead_Tab"));
	   clickElement(leads,"leads");
	   Thread.sleep(1400);
	   clickElement(driver.findElement(By.id("tryLexDialogX")),"X");
	   WebElement view = driver.findElement(By.name("fcf"));
	   validateDropdown(view, "element1","element2", "element3", "element4");
	   }   
	   
 @Test
  
 
 public static void salesforceTC22DefaultVeiw() throws InterruptedException{
	 CommonUtilities CU = new CommonUtilities();
     Properties applicationPropertiesFile = CU.loadfile("applicationProperties");
		
	 String passwrd = CU.getApplicationProperty("passwrd",applicationPropertiesFile);
     
	   loginToSalesforceMethod();
	   WebElement leads = driver.findElement(By.id("Lead_Tab"));
	   clickElement(leads,"leads");
	   Thread.sleep(1400);
	   clickElement(driver.findElement(By.id("tryLexDialogX")),"X");
	   WebElement view = driver.findElement(By.name("fcf"));
	   Select select1 = new Select(view);
	    select1.selectByVisibleText("Today's Leads");
	    Thread.sleep(2000);
	    fullScreenshot();
	    WebElement shradha= driver.findElement(By.id("userNav"));
		clickElement(shradha,"shradha");
		WebElement logout = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
		waitUntilVisible(logout,"logout");
		clickElement(logout,"log out");
		Thread.sleep(2000);
		WebElement password1 = driver.findElement(By.id("password"));
    	waitUntilVisible(password1,"password");
    	enterText(password1,passwrd,"pass word");
    	WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"Login\"]"));
    	waitUntilVisible(loginbutton,"loginbutton");
    	clickElement(loginbutton,"login button");
		WebElement leads1 = driver.findElement(By.id("Lead_Tab"));
		clickElement(leads1,"leads");
	    WebElement go = driver.findElement(By.name("go"));
	    clickElement(go,"Go");
	    fullScreenshot();
	    report.logTestPassed("test is passed");
	       
 }
 @Test
 public static void salesforceTC23leadsTab() throws InterruptedException{
	   loginToSalesforceMethod();
	   WebElement leads = driver.findElement(By.id("Lead_Tab"));
	   clickElement(leads,"leads");
	   Thread.sleep(1400);
	   clickElement(driver.findElement(By.id("tryLexDialogX")),"X");
	   WebElement view = driver.findElement(By.name("fcf"));
	   Select select1 = new Select(view);
	    select1.selectByVisibleText("Today's Leads");
	    Thread.sleep(2000);
       WebElement go = driver.findElement(By.name("go"));
       clickElement(go,"Go");
       report.logTestPassed("test is passed");
       
}
 
 
 
 
@Test
 
 
 public static void salesforceTC24leadsTab() throws InterruptedException{
	  CommonUtilities CU = new CommonUtilities();
	    Properties applicationPropertiesFile = CU.loadfile("applicationProperties");
	    
	    CU.getApplicationProperty("firstname",applicationPropertiesFile);
	    CU.getApplicationProperty("lastname",applicationPropertiesFile);
	    CU.getApplicationProperty("company",applicationPropertiesFile);
	   loginToSalesforceMethod();
	   WebElement leads = driver.findElement(By.id("Lead_Tab"));
	   clickElement(leads,"leads");
	   Thread.sleep(1400);
	   clickElement(driver.findElement(By.id("tryLexDialogX")),"X");
       WebElement view = driver.findElement(By.name("new"));
       clickElement(view,"view");
       WebElement firstname1 = driver.findElement(By.id("name_firstlea2"));
		firstname1.clear();
		firstname1.sendKeys( CU.getApplicationProperty("firstname",applicationPropertiesFile));
       Thread.sleep(1000);
       WebElement lastname1 = driver.findElement(By.id("name_lastlea2"));
		lastname1.clear();
		lastname1.sendKeys( CU.getApplicationProperty("firstname",applicationPropertiesFile));
		WebElement company = driver.findElement(By.id("lea3"));
		company.clear();
		company.sendKeys( CU.getApplicationProperty("firstname",applicationPropertiesFile));
       WebElement save = driver.findElement(By.name("save"));
       clickElement(save,"save");
       fullScreenshot();
       

 
 
}
@Test


public static void createNewContactTC25() throws InterruptedException{
	 CommonUtilities CU = new CommonUtilities();
	    Properties applicationPropertiesFile = CU.loadfile("applicationProperties");
	    
	    CU.getApplicationProperty("laname",applicationPropertiesFile);
	    CU.getApplicationProperty("Accountname",applicationPropertiesFile);
	   loginToSalesforceMethod();
       WebElement contact = driver.findElement(By.id("Contact_Tab"));
       clickElement(contact,"contact");
       Thread.sleep(1900);
       clickElement(driver.findElement(By.id("tryLexDialogX")),"X");
       WebElement new1 = driver.findElement(By.name("new"));
       clickElement(new1,"New");
       WebElement laname1 = driver.findElement(By.id("name_lastcon2"));
       laname1.clear();
       laname1.sendKeys( CU.getApplicationProperty("laname",applicationPropertiesFile));
     		
      WebElement Accountname1 = driver.findElement(By.id("con4"));
      Accountname1.clear();
      Accountname1.sendKeys( CU.getApplicationProperty("Accountname",applicationPropertiesFile));
      WebElement save = driver.findElement(By.name("save"));
      	save.click();
      	
 
} 
@Test


public static void createNewViewContactTC26() throws InterruptedException{
	CommonUtilities CU = new CommonUtilities();
    Properties applicationPropertiesFile = CU.loadfile("applicationProperties");
	loginToSalesforceMethod();
	WebElement contact = driver.findElement(By.id("Contact_Tab"));
    clickElement(contact,"contact");
    Thread.sleep(1900);
    clickElement(driver.findElement(By.id("tryLexDialogX")),"X");
    WebElement cNW = driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[2]"));
    cNW.click();
    WebElement viewName = driver.findElement(By.id("fname"));
    viewName.sendKeys(applicationPropertiesFile.getProperty("viewName"));
    WebElement save = driver.findElement(By.name("save"));
    save.click();
	}

@Test
public static void checkRecentlyCreatedContactTC27() throws InterruptedException {
	CommonUtilities CU = new CommonUtilities();
    Properties applicationPropertiesFile = CU.loadfile("applicationProperties");
	loginToSalesforceMethod();
	WebElement contact = driver.findElement(By.id("Contact_Tab"));
    clickElement(contact,"contact");
    Thread.sleep(1900);
    clickElement(driver.findElement(By.id("tryLexDialogX")),"X");
    WebElement rsel = driver.findElement(By.name("hotlist_mode"));
    Select recently = new Select(rsel);
    recently.selectByVisibleText("Recently Created");
    Thread.sleep(2000);
}

@Test
public static void checkMyContactsTC28() throws InterruptedException {
	loginToSalesforceMethod();
	WebElement contact = driver.findElement(By.id("Contact_Tab"));
    clickElement(contact,"contact");
    Thread.sleep(1900);
    clickElement(driver.findElement(By.id("tryLexDialogX")),"X");
    WebElement view = driver.findElement(By.name("fcf"));
    Select viewSel = new Select(view);
    viewSel.selectByVisibleText("My Contacts");
    Thread.sleep(2000);
}	

@Test
public static void viewContactTC29() throws InterruptedException {
	
    loginToSalesforceMethod();
	WebElement contact = driver.findElement(By.id("Contact_Tab"));
    clickElement(contact,"contact");
    Thread.sleep(1900);
    clickElement(driver.findElement(By.id("tryLexDialogX")),"X");
    WebElement rname = driver.findElement(By.xpath("//*[@id=\"bodyCell\"]/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/th/a"));
	clickElement(rname, "random Name");
	}

@Test
public static void checkErrorTC30() throws Exception {
	CommonUtilities CU = new CommonUtilities();
    Properties applicationPropertiesFile = CU.loadfile("applicationProperties");
    loginToSalesforceMethod();
		WebElement contact = driver.findElement(By.id("Contact_Tab"));
	    clickElement(contact,"contact");
	    Thread.sleep(1900);
	    clickElement(driver.findElement(By.id("tryLexDialogX")),"X");
	    WebElement cNW = driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[2]"));
	    cNW.click();
	    WebElement viewName = driver.findElement(By.id("fname"));
	    viewName.sendKeys(applicationPropertiesFile.getProperty("viewName"));
	    WebElement save = driver.findElement(By.name("save"));
	    save.click();
	}

@Test
public static void checkCancelTC31() throws Exception{
	CommonUtilities CU = new CommonUtilities();
    Properties applicationPropertiesFile = CU.loadfile("applicationProperties");
    loginToSalesforceMethod();
		WebElement contact = driver.findElement(By.id("Contact_Tab"));
	    clickElement(contact,"contact");
	    Thread.sleep(1900);
	    clickElement(driver.findElement(By.id("tryLexDialogX")),"X");
	    WebElement cNW = driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[2]"));
	    cNW.click();
	    WebElement viewName = driver.findElement(By.id("fname"));
	    viewName.sendKeys(applicationPropertiesFile.getProperty("viewName"));
	    WebElement cancel = driver.findElement(By.name("cancel"));
	    cancel.click();
	    
}
@Test
public static void checkSaveAndNewTC32() throws Exception{
CommonUtilities CU = new CommonUtilities();
Properties applicationPropertiesFile = CU.loadfile("applicationProperties");
loginToSalesforceMethod();
	WebElement contact = driver.findElement(By.id("Contact_Tab"));
    clickElement(contact,"contact");
    Thread.sleep(1900);
    clickElement(driver.findElement(By.id("tryLexDialogX")),"X");
    WebElement New = driver.findElement(By.name("new"));
    New.click();
    WebElement lname = driver.findElement(By.name("name_lastcon2"));
    lname.sendKeys(applicationPropertiesFile.getProperty("lbname"));
    WebElement ACname = driver.findElement(By.name("con4"));
    ACname.sendKeys(applicationPropertiesFile.getProperty("Accountname"));
    WebElement saveNew = driver.findElement(By.name("save_new"));
    saveNew.click();
    
	}
@Test
public static void salesforceTC33() throws Exception{
	loginToSalesforceMethod();
	WebElement hometab = driver.findElement(By.id("home_Tab"));
	clickElement(hometab,"HomeTab");
	Thread.sleep(3900);
	System.out.println("i am here");
    clickElement(driver.findElement(By.id("tryLexDialogX")),"X");
    //Thread.sleep(5900);
	WebElement name = driver.findElement(By.linkText("Shweta Abcd"));
	verifyLinkAvailability(name);
	clickElement(name,"name");
	Thread.sleep(2900);
	String actual = driver.getCurrentUrl();
	Thread.sleep(2900);
	WebElement shwetamittal = driver.findElement(By.id("userNavLabel"));
	clickElement(shwetamittal,"shwetamittal");
	WebElement myprofile = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[1]"));
	clickElement(myprofile,"myprofile");
	//waitUntilVisible(myprofile,"myprofile");
	String expected = driver.getCurrentUrl();
	Assert.assertEquals(actual, expected);
}


@Test
public static void verifyTC34() throws Exception{
	CommonUtilities CU = new CommonUtilities();
	Properties applicationPropertiesFile = CU.loadfile("applicationProperties");
	loginToSalesforceMethod();
	WebElement home = driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a"));
	home.click();
	Thread.sleep(2500);
    clickElement(driver.findElement(By.id("tryLexDialogX")),"X");
	WebElement profile = driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a"));
	profile.click();
	WebElement edit = driver.findElement(By.xpath("//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a"));
	edit.click();
	driver.switchTo().frame(2);
	WebElement about = driver.findElement(By.xpath("//*[@id=\"aboutTab\"]/a"));
	about.click();
	WebElement lname = driver.findElement(By.name("lastName"));
	lname.clear();
	lname.sendKeys(applicationPropertiesFile.getProperty("lcname"));
	WebElement saveAll = driver.findElement(By.xpath("//*[@id=\"TabPanel\"]/div/div[2]/form/div/input[1]"));
	saveAll.click();
	
}
@Test
public static void tabCustomizationTC35() throws InterruptedException {
	
    loginToSalesforceMethod();
    
    WebElement alltabs = driver.findElement(By.id("AllTab_Tab"));
    alltabs.click();
  Thread.sleep(1400);
    WebElement cMT = driver.findElement(By.name("customize"));
    cMT.click();
    Thread.sleep(1400);
    WebElement selectT = driver.findElement(By.name("duel_select_1"));
    Select selectTS = new Select(selectT);
    selectTS.selectByIndex(1);
    WebElement rm =driver.findElement(By.id("duel_select_0_left"));
    rm.click();
    WebElement save = driver.findElement(By.name("save"));
    save.click();
    driver.navigate().refresh();
    
	}
	@Test
	public static void blockEventTC36() throws Exception{
		CommonUtilities CU = new CommonUtilities();
		Properties applicationPropertiesFile = CU.loadfile("applicationProperties");
		loginToSalesforceMethod();
	    WebElement home = driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a"));
	    home.click();
	    Thread.sleep(2500);
	    clickElement(driver.findElement(By.id("tryLexDialogX")),"X");
	    WebElement currentDate = driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[2]/a"));
	    currentDate.click();
	    Thread.sleep(1500);
	    WebElement eightPM = driver.findElement(By.xpath("//*[@id=\"p:f:j_id25:j_id61:28:j_id64\"]/a"));
	    eightPM.click();
	    WebElement subjectCombo = driver.findElement(By.xpath("//*[@id=\"ep\"]/div[2]/div[4]/table/tbody/tr[2]/td[2]/div/a"));
	    subjectCombo.click();
	    String oWH = driver.getWindowHandle();
	    Set<String> wH = driver.getWindowHandles();
	    for(String handle: wH) {
	    	if(!oWH.equals(handle)) {
	    	    driver.switchTo().window(handle);

	    	}
	    }
	    WebElement other = driver.findElement(By.xpath("/html/body/div[2]/ul/li[5]/a"));
	    other.click();
	    driver.switchTo().window(oWH);
	    WebElement endTime = driver.findElement(By.name("EndDateTime_time"));
	    endTime.clear();
	    endTime.sendKeys(applicationPropertiesFile.getProperty("endTime"));
	    Thread.sleep(1200);
	    WebElement save = driver.findElement(By.name("save"));
	    save.click();
	}
	@Test
	public static void blockAnyTC37() throws Exception{
		CommonUtilities CU = new CommonUtilities();
		Properties applicationPropertiesFile = CU.loadfile("applicationProperties");
		loginToSalesforceMethod();
		WebElement home = driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a"));
	    home.click();
	    Thread.sleep(2700);
	    clickElement(driver.findElement(By.id("tryLexDialogX")),"X");
	    WebElement currentDate = driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[2]/a"));
	    currentDate.click();
	    Thread.sleep(1500);
	    WebElement four = driver.findElement(By.xpath("//*[@id=\"p:f:j_id25:j_id61:20:j_id64\"]/a"));
	    four.click();
	    WebElement subjectCombo = driver.findElement(By.xpath("//*[@id=\"ep\"]/div[2]/div[4]/table/tbody/tr[2]/td[2]/div/a"));
	    subjectCombo.click();
	    String oWH = driver.getWindowHandle();
	    Set<String> wH = driver.getWindowHandles();
	    for(String handle: wH) {
	    	if(!oWH.equals(handle)) {
	    	    driver.switchTo().window(handle);

	    	}
	    }
	    WebElement other = driver.findElement(By.xpath("/html/body/div[2]/ul/li[5]/a"));
	    other.click();
	    driver.switchTo().window(oWH);
	    WebElement endTime = driver.findElement(By.name("EndDateTime_time"));
	    endTime.clear();
	    endTime.sendKeys(applicationPropertiesFile.getProperty("endTimeTwo"));
	    Thread.sleep(1200);
	    WebElement recurrence = driver.findElement(By.name("IsRecurrence"));
	    recurrence.click();
	    WebElement weekly = driver.findElement(By.id("rectypeftw"));
	    weekly.click();
	    WebElement endDate = driver.findElement(By.name("RecurrenceEndDateOnly"));
	    endDate.clear();
	    endDate.sendKeys(applicationPropertiesFile.getProperty("endDate"));
	    WebElement save = driver.findElement(By.name("save"));
	    save.click();
	    		WebElement monthly = driver.findElement(By.xpath("//*[@id=\"bCalDiv\"]/div/div[2]/span[2]/a[3]/img"));
	    		monthly.click();
	    }
	

}








