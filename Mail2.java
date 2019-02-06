package New_Pack;
package New_Pack;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mail2 {
     public static void main(String[] args) throws InterruptedException{
			// TODO Auto-generated method stub
						System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
						ChromeDriver driver = new ChromeDriver();
						driver.get("https://www.gmail.com");
						driver.findElement(By.name("identifier")).sendKeys("subasriss16");
						Thread.sleep(2000);
						driver.findElement(By.id("identifierNext")).click();
						Thread.sleep(2000);
						driver.findElement(By.name("password")).sendKeys("subasrisargunam");
						Thread.sleep(2000);
						driver.findElement(By.id("passwordNext")).click();
						Thread.sleep(2000);
						driver.findElement(By.id(":im")).click();
						Thread.sleep(2000);
						driver.findElement(By.id(":mo")).sendKeys("sssubasri1996@gmail.com");
						Thread.sleep(2000);
						driver.findElement(By.id(":mi")).sendKeys("Intro");
						Thread.sleep(2000);
						driver.findElement(By.id(":1d")).sendKeys("Hiii!!!");
						Thread.sleep(2000);
						driver.findElement(By.id(":ms")).click();
						}
				}


