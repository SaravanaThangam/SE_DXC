

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amahendraka2\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		String search_tag = "DXC";
		
		int sleep_value = 2000;
		
		WebElement search = driver.findElement(By.name("q"));
		 
		
		driver.findElement(By.name("q")).sendKeys(search_tag);
		
		Thread.sleep(sleep_value);
//		
//		driver.findElement(By.name("q")).clear();
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.name("q")).sendKeys("DXC Tech");
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.name("btnK")).click();
		
	}
}
