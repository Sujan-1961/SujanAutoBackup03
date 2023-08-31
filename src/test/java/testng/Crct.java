package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Crct {
  @Test
  public void f() {
	  ChromeOptions options =  new ChromeOptions();
		options.addArguments("start-maximized", "-disable--notifications");
		ChromeDriver d =  new ChromeDriver(options);
		d.get("https://phptravels.net/login");
		d.findElement(By.name("email")).sendKeys("user@phptravels.com");
		d.findElement(By.name("password")).sendKeys("demouser");
		WebElement findElement = d.findElement(By.id("submitBTN"));
		findElement.click();
  }
}
