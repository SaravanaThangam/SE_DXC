package Newone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello1
{
	public static void main(String[] args) throws InterruptedException
	{
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmamatha\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//driver.close();
		
		driver.get("https://www.google.com");
		
		String search_tag = "DXC";
		int sleep_value = 2000;
		WebElement search = driver.findElement(By.name("q"));
		
		
		search.sendKeys(search_tag);
	    Thread.sleep(sleep_value);
		
		
		driver.findElement(By.name("btnK")).click();
		
		driver.findElement(By.partialLinkText("DXC Technology: Global IT Services and Solutions Leader")).click();
		
		driver.close();
		
		
}
}