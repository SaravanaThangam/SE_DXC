package Sem;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailOpen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 // to connect to chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(2000);
		//int sleep_value = 2000;
		driver.findElement(By.name("identifier")).sendKeys("kaurmandeep0917@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Papa@123");
		//driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("Papa@123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id(":iu")).click(); // compose
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.name("to")).sendKeys("kaurmandeep0917@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("subjectbox")).sendKeys("Hello");
		Thread.sleep(2000);
		driver.findElement(By.id(":sy")).sendKeys("How ARE YOU");
		Thread.sleep(2000);
		driver.findElement(By.id(":z9")).click();
		//driver.close();

	}

}
