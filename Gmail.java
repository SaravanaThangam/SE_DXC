package Newone;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail 
{
	
	public static void main(String[] args) throws InterruptedException
	{
	    
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmamatha\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	//driver.close();
	
	driver.get("https://www.google.com/gmail/");
	
	String search_tag = "mamathalike@gmail.com";
	int sleep_value = 2000;
	
	WebElement search = driver.findElement(By.name("identifier"));
	
	search.sendKeys(search_tag);
    Thread.sleep(sleep_value);
    
    driver.findElement(By.name("ZFr60d CeoRYc")).click();

}
}