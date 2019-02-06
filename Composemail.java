import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Composemail {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
        ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("identifierId")).sendKeys("keerthymarakanti");
		
		driver.findElement(By.id("identifierNext")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("marakanti4");
		
		driver.findElement(By.id("passwordNext")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id(":k8")).click(); // compose
		
//		Thread.sleep(2000);
		
		driver.findElement(By.id(":qc")).sendKeys("keerthymarakanti@gmail.com"); // to
		
//		Thread.sleep(2000);
		
      	driver.findElement(By.id(":pu")).sendKeys("Demo"); // subject
		
		driver.findElement(By.id(":qz")).sendKeys("Hi keerthy"); // body
		
		driver.findElement(By.id(":pk")).click(); // send

	}

}
