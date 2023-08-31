package testng;


import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

@Test
public class Amazon {


	public static void main(String[] args) throws InterruptedException, WebDriverException {
		EdgeDriver driver = new EdgeDriver ();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(" https://www.amazon.in/");
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='autocomplete-results-container']//div[9]")).click();
		String text1 = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println(text1);
		driver.findElement(By.xpath("//li[@id='p_89/American Tourister']")).click();
		String text2 = driver.findElement(By.xpath("//div[@class='sg-col-inner']")).getText();
		System.out.println(text2);
		if (text1.equals(text2)) {
			System.out.println("The results are the same");
		} else {
                 System.out.println("The results got reduced");
		}
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		String text4 = driver.findElement(By.xpath("//span[text()='VALEX BLACK LAPTOP BACKPACK 28 Ltrs,Volume, LAPTOP COMPARTMENT, BOTTLE POCKET, FRONT ORGANIZER']")).getText();
		System.out.println(text4);
		String text5 = driver.findElement(By.xpath("//span[text()='1,299']")).getText();
		System.out.println(text5);
		String bckgclr = driver.findElement(By.xpath("//span[@id='DEAL_OF_THE_DAY_B0BTD4S4XF-label']")).getCssValue("background-color");
		System.out.println(bckgclr);
		File scrnsht = driver.getScreenshotAs(OutputType.FILE);
		System.out.println(scrnsht);
		
}
}
