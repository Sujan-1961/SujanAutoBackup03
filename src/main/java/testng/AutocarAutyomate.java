package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AutocarAutyomate {
	@Test
           public void Autocar() {
        	   ChromeOptions options = new ChromeOptions();
         	    options.addArguments("--remote-allow-origins=*");
   			ChromeDriver driver = new ChromeDriver();
   			driver.manage().window().maximize();
   			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   			driver.get("https://www.autocarindia.com/");
   			WebElement findacar = driver.findElement(By.xpath("//a[text()='Find a Car ']"));
   			Actions actions = new Actions(driver);
   			actions.moveToElement(findacar);
		}
}
