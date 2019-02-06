package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class loginwithxpath {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\st34\\\\Downloads\\\\chromedriver\\\\chromedriver.exe");
        
        ChromeDriver driver = new ChromeDriver();   //can connect to chrome browser
                  driver.get("https://www.gmail.com");
                  driver.findElementById("identifierId").sendKeys("saravanathangamt");
                  Thread.sleep(2000);
                  driver.findElementById("identifierNext").click();
                  Thread.sleep(2000);
                  driver.findElement(By.name("password")).sendKeys("**********");
                  Thread.sleep(2000);
                  driver.findElementById("passwordNext").click();
                  Thread.sleep(2000);
                  driver.manage().window().maximize();
                  Thread.sleep(2000);
                  driver.findElement(By.xpath("//*[contains(@id,\":jz\")]")).click();
//                  driver.findElementById(":jz").click();
                  Thread.sleep(8000);
                  driver.findElement(By.xpath("//textarea[contains(@id,\":q2\")]")).sendKeys("saravanathangamt@gmail.com");
//                  driver.findElementById(":q2").sendKeys("saravanathangamt@gmail.com");
                  Thread.sleep(2000);
                  driver.findElement(By.xpath("//input[contains(@id,\":pk\")]")).sendKeys("Demo with X-path");
//                  driver.findElementById(":pk").sendKeys("Demo");
                  Thread.sleep(2000);
                  driver.findElement(By.xpath("//div[contains(@id,\":qp\")]")).sendKeys("Hi da, How are you ? \n I am fine ");
//                  driver.findElementById(":qp").sendKeys("Hi da, How are you ? \n I am fine ");
                  Thread.sleep(2000);
                  driver.findElement(By.xpath("//div[contains(@id,\":pa\")]")).click();
//                  driver.findElementById(":pa").click();
//                  Thread.sleep(2000);
	}

}
