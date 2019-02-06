import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com/mail/u/0/");
		driver.findElement(By.id("identifierId")).sendKeys("singh.binita.92");
		driver.findElement(By.id("identifierNext")).click();
		// element.submit();
		// element.submit();	
		Thread.sleep(6000);
		driver.findElement(By.name("password")).sendKeys("ASDF$");
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(2000);
		driver.findElement(By.id(":il")).click();
		Thread.sleep(5000);
		driver.findElement(By.id(":oe")).sendKeys("ABC@gmail.com"); // works till here
		Thread.sleep(5000);
		driver.findElement(By.id(":nw")).sendKeys("Automated mail");
		Thread.sleep(2000);
		driver.findElement(By.id(":p1")).sendKeys("Hello, \nThis mail is sent via automation :p\nI am trying something here so you may get few mail\nBear with that ");
		Thread.sleep(2000);
		driver.findElement(By.id(":nm")).click();
		Thread.sleep(2000);
		driver.findElement(By.id(":ix")).click();
		
		

	}

}
