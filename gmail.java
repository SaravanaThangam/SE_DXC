package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ar52\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.get("http://gmail.com");
			driver.findElement(By.xpath("//*[@type='email']")).sendKeys("anoop.r172@gmail.com");
			driver.findElement(By.xpath("//content[@class='CwaK9']")).click();
			Thread.sleep(5000);
//			
			
	
			driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Anoop_phase@666");
			driver.findElement(By.xpath("//content[@class='CwaK9']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("anoop.r172@gmail.com");
			driver.findElement(By.xpath("//input[@id=':q2']")).sendKeys("good work");
			driver.findElement(By.xpath("//div[@id=':r7']")).sendKeys("congo");
			driver.findElement(By.xpath("//td[@class='gU Up']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@title='Sent']")).click();
		
	}
}
// d=new WebDriverWait(driver,5);
//d.untill(ExpectedConditions.visibilityOf(element);
//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);