import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmaildemo {

	public static void main(String[] args) throws InterruptedException {
	
    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
        ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.gmail.com");
		
	     Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@name=\"identifier\"]")).sendKeys("keerthymarakanti");
		
		driver.findElement(By.xpath("//div[@id=\"identifierNext\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("marakanti4");
		
		driver.findElement(By.xpath("//div[@id=\"passwordNext\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id=\":k8\"]")).click(); // compose
		
    	Thread.sleep(3000);
		
		driver.findElement(By.xpath("//textarea[@name=\"to\"]")).sendKeys("keerthymarakanti@gmail.com"); // to
		
    	Thread.sleep(2000);
		
      	driver.findElement(By.xpath("//input[@id=\":pu\"]")).sendKeys("Demo"); // subject
		
		driver.findElement(By.xpath("//div[@id=\":qz\"]")).sendKeys("Hi keerthy"); // body
		
		driver.findElement(By.xpath("//div[@id=\":pk\"]")).click(); // send
		
		

	}

}

