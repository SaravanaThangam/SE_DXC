import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("amahendrakar21");
		driver.findElement(By.xpath("//div[@role='button' and @id='identifierNext']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("firewings18");
		driver.findElement(By.xpath("//div[@role = 'button' and @id = 'passwordNext']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class = 'z0']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@name ='to']")).sendKeys("amahendrakar21@gmail.com");
		driver.findElement(By.xpath("//input[@name = 'subjectbox']")).sendKeys("Hello");
		driver.findElement(By.xpath("//div[@role = 'textbox']")).sendKeys("Dear Akshaykumar,"
				+ "Good Morning"
				+ "Regards,"
				+ "Akshaykumar");
		
		driver.findElement(By.xpath("//td[@class = 'gU Up']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='TN bzz aHS-bnu']")).click();
	}

}
