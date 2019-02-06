package Newone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail2 
{
	public static void main(String[] args) throws InterruptedException
	{
	    
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmamatha\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.gmail.com");
	
	driver.findElement(By.name("identifier")).sendKeys("mamathalike");
	Thread.sleep(2000);
	
	driver.findElement(By.id("identifierNext")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.name("password")).sendKeys("mama2209");
	Thread.sleep(2000);
	
	driver.findElement(By.id("passwordNext")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id(":kq")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id(":qs")).sendKeys("mamathalike@gamail.com");
	Thread.sleep(2000);
	
	driver.findElement(By.id(":qa")).sendKeys("Test");
	Thread.sleep(2000);
	
	driver.findElement(By.id(":rf")).sendKeys("Testing success..!");
	Thread.sleep(2000);
	
	driver.findElement(By.id(":q0")).click();
	Thread.sleep(2000);
	
	}
	

}
