package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ExtentReport {
	ChromeDriver d;
    @Test
    public void openGoogle() {
    	d.get("https://www.google.com/");
    	String title = d.getTitle();
    	if (title.equals("Google")) {
			System.out.println("Pass");
		} else {
               System.out.println("fail");
		}
    	
    }
    
    @Test
    public void openBig() {
    	d.get("https://www.bing.com/");
    	String title = d.getTitle();
    	//System.out.println(title);
    	if (title.equals("Bing")) {
			System.out.println("pass");
		} else {
    System.out.println("fail");
		}
    	
    }
    
    @Test
    public void openMaven() {
    	d.get("https://mvnrepository.com/artifact/io.cucumber");
    	String title = d.getTitle();
    	//System.out.println(title);
    	if (title.contains("Maven Repository")) {
			System.out.println("pass");
		} else {
    System.out.println("fail");
		}
    	
    }
    
    @BeforeSuite
    public void launchBrowser() {
    	d = new ChromeDriver();
    }
    
    @AfterSuite
    public void closeBrowser() {
    	d.quit();
    }
}
