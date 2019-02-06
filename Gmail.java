

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		
		
		
		driver.findElement(By.name("identifier")).sendKeys("amahendrakar21");
		
		
		driver.findElement(By.id("identifierNext")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("password")).sendKeys("firewings18");
		
		driver.findElement(By.id("passwordNext")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.className("z0")).click();
		
		Thread.sleep(7000);
		
		driver.findElement(By.id(":qv")).sendKeys("amahendrakar21@gmail.com");
		
		driver.findElement(By.name("subjectbox")).sendKeys("uwevhovh");
		
		driver.findElement(By.id(":ri")).sendKeys("uwevhovh");
		driver.findElement(By.id(":q3")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".qj.qr")).click();
		
	}

}
