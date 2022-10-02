package com.firebase.test.tests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
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
		clickElement(myprofile,"my profile");
		waitUntilVisible(myprofile,"my profile");
		Thread.sleep(2000);

		//Edit Profile
		System.out.println("Inside chromeTC06");
		WebElement editprofile = driver.findElement(By.xpath("//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a"));
		waitUntilVisible(editprofile,"editprofile");
		//clickElement(editprofile,"edit profile");
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
    driver.close();
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
    driver.close();
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
    driver.close();
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
	    driver.close();
}

}





