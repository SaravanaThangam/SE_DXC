package Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\pp77\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
          driver.get("http://www.gmail.com");
          	 
	     
   // WebElement search = driver.findElement(By.name("q"));
    
    
    driver.findElement(By.id("identifierId")).sendKeys("punith.p@dxc.com");
   Thread.sleep(2000);
	}
}  