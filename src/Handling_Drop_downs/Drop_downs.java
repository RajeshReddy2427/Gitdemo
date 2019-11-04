package Handling_Drop_downs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drop_downs {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh Reddy\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
	    //driver.findElement(By.xpath("//a[@value='GOI']")).click();
	    //This is parent child relationship
	    driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='GOI']")).click();
	    driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='GOI']")).click();
	    driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='GOI']")).click();
	    driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXTaction")).click();
	    driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
	   
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
