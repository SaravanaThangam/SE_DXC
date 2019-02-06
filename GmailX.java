package Newone;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailX
{
	public static void main(String[] args) throws InterruptedException
	{
	    
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmamatha\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.gmail.com");
			
	driver.findElement(By.id("identifierId")).sendKeys("mamathalike");
	
	driver.findElement(By.id("identifierNext")).click();
	
	
	
	driver.findElement(By.name("password")).sendKeys("m");
	
	
	driver.findElement(By.id("passwordNext")).click();
	
	
	driver.findElement(By.xpath("//div[@class='z0']/div")).click();
	
	
	driver.findElement(By.xpath("//div[@class='gb_1 gb_3a gb_nc gb_e']/div/a")).click();
	
	
	driver.findElement(By.xpath("//*[@id='gb_71']")).click();
	driver.close();
	}

}
