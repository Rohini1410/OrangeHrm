package org.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	///

	public static WebDriver driver;
	
	
	public static void launchBrwoser() {
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohini Jayaraman\\eclipse-workspace\\SeleniumTask\\src\\Driverversion\\chromedriver.exe");
   driver= new ChromeDriver();

	}
	
	public static void getUrl(String url) {
	driver.get(url);

	}
	public static void maximize() {
driver.manage().window().maximize();
	}
	
	public static String currentUrl() {
	String currentUrl = driver.getCurrentUrl();
	
	return currentUrl;
}
	
	public static String currenTilte() {
		String currenTilte = driver.getTitle();
		
		return currenTilte;
		}
	public static void insert(WebElement e ,String Value) {
	e.sendKeys(Value);
		}
	public static void click(WebElement e) {
		e.click();
       }
    public static void closeBrowser() {
		driver.close();
      }
     public static void quitBrowser() {
		driver.quit();

    }
     
     public static void implicitwait() {
    	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     }


	}

    
  
     
     
     
     
    

