package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CarwaleAutomation {
	@Test
        public void Carwale(){
        	ChromeOptions options = new ChromeOptions();
      	    options.addArguments("--remote-allow-origins=*");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.carwale.com/");
			driver.findElement(By.xpath("//div[text()='NEW CARS']")).click();
			WebElement element = driver.findElement(By.xpath("//div[text()='Electric Cars']"));
			Actions actions = new Actions(driver);
			actions.moveToElement(element);	
			element.click();
			
			driver.findElement(By.xpath("//h3[text()='Mahindra XUV400']")).click();
		}
}
