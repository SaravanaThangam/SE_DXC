package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class login {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\st34\\\\Downloads\\\\chromedriver\\\\chromedriver.exe");
        
        ChromeDriver driver = new ChromeDriver();   //can connect to chrome browser
                  driver.get("https://www.gmail.com");
                  driver.findElementById("identifierId").sendKeys("saravanathangamt");
                  Thread.sleep(2000);
                  driver.findElementById("identifierNext").click();
                  Thread.sleep(2000);
                  driver.findElement(By.name("password")).sendKeys("*********");
                  Thread.sleep(2000);
                  driver.findElementById("passwordNext").click();
                  Thread.sleep(2000);
                  driver.manage().window().maximize();
                  Thread.sleep(2000);
//                  driver.findElementByXPath("//*[@Id=':jz']");
                  driver.findElementById(":jz").click();
                  Thread.sleep(6000);
                  driver.findElementById(":q2").sendKeys("saravanathangamt@gmail.com");
                  Thread.sleep(2000);
                  driver.findElementById(":pk").sendKeys("Demo");
                  Thread.sleep(2000);
                  driver.findElementById(":qp").sendKeys("Hi da, How are you ? \n Get job & leave DXC ");
                  Thread.sleep(2000);
                  driver.findElementById(":pa").click();
                  Thread.sleep(2000);
	}

}
