package Newone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello2
{
	public static void main(String[] args) throws InterruptedException
	{
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmamatha\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//driver.close();
		
		driver.get("https://www.google.com");
		
		String search_tag = "DXC";
		int sleep_value = 2000;
		boolean visible = false;
		WebElement search = driver.findElement(By.name("q"));
		
		
		search.sendKeys(search_tag);
	    Thread.sleep(sleep_value);
	    
	    search.clear();
		
		
	    search.sendKeys(search_tag);
	    Thread.sleep(sleep_value);
	    
		try
	      {
	       visible = driver.findElement(By.name("btnk")).isDisplayed();
	      }
	    	  catch (Exception e)
	    	  {
	    		e.printStackTrace();  
	    	  }
	      
	   System.out.println(visible);
		
	   driver.findElement(By.name("btnK")).click();
	   Thread.sleep(sleep_value);
	
	   driver.findElement(By.tagName("input"));
	   driver.findElement(By.partialLinkText("DXC Technology: Global IT Services and Solutions Leader")).click();

	   Thread.sleep(sleep_value);
	

		//driver.close();
		
		
}
}