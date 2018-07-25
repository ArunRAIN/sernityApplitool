package com.WEBTECHQA.appli.pages;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.ProxySettings;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.Eyes;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.WebDriverFacade;

public class CarouselBannerPage extends PageObject
{
	//public WebDriver driver;
	public Eyes eyes;
	public static Boolean commonBaseline=true;
	   public static  String commonBaselineFlag=null;
	   protected String baselineNamePrefix ="";
	
	
	public void precondition()
	{
		
		
		    String appName = "Demo1 APP2 ";
	        String batchName = "Demo1  Batch";
	        String testName = "Demo1 Test";
		
	        
	        
	        Date now = new Date();
	        SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmss");
	        String batchId = sdf.format(now);
	        
	        
	        //driver=new FirefoxDriver();
	        
		eyes = new Eyes();
		eyes.setApiKey("Ygh0gXTCrKm3wYFY0Gzff0k1tJ7xDAo6MQdv7gBThtk110");
		BatchInfo bi = new BatchInfo(batchName);
        bi.setId(batchId);
        eyes.setBatch(bi);
        eyes.setProxy(new ProxySettings("http://www-proxy-hqdc.us.oracle.com"));
        //baselineNamePrefix = "HomePage Baseline";
        eyes.setMatchLevel(MatchLevel.LAYOUT);
        baselineNamePrefix = "HomePage Baseline";
	    //eyes.setProxy(new ProxySettings("http://www-proxy.us.oracle.com"));
	    eyes.setProxy(new ProxySettings("http://www-proxy-hqdc.us.oracle.com"));
	    
	    
	 

	    //eyes.setForceFullPageScreenshot(true);
        eyes.setEnvName("HomePage Baseline1" + " " + Integer.toString(677) + "x" + 560);
	    eyes.open(getDriver(), appName, testName,new RectangleSize(677,566));
	   
	  // driver= eyes.open(((WebDriverFacade) driver).getProxiedDriver(), appName, testName, new RectangleSize(677,566));

	    getDriver().get("https://www.oracle.com");
	    
	    eyes.checkWindow();
	}
	
	
	
	public void postcondition()
	{
		
		
		eyes.abortIfNotClosed();
		
        driver.close();
        
        
        
	}
}