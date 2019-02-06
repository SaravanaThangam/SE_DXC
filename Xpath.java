import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com/mail/u/0/");
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("singh.binita.92");
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		Thread.sleep(9000);
		driver.findElement(By.name("password")).sendKeys("Asdfg");
		// driver.findElement(By.xpath("//div
		// [@name='password']")).sendKeys("airforce1234$");
		driver.findElement(By.xpath("//div [@id='passwordNext']")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//div[@id=':il']")).click();
		// *[@class='T-I J-J5-Ji T-I-KE L3']
		driver.findElement(By.xpath("//*[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id=':oe']")).sendKeys("ABC@gmail.com"); 
																											// here
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id=':nw']")).sendKeys("Automated mail");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=':p1']")).sendKeys("Hello, \nThis one is with xpath :p\n");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=':nm']")).click();// works till here
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=':j6']")).click();

	}

}
