package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {
	
	
	public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ar52\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://google.com");
	driver.findElement(By.xpath("//div[@id='gb']/div/div/div/div/div[2]/a")).click();
	//  driver.findElement(By.cssSelector("img[alt*='Selenium WebDriver']")).click();
}
}
