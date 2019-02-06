package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {
	public static void main(String [] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:/Tools/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		/*WebElement Search = driver.findElement(By.className("gLFyf.gsfi"));
		Search.sendKeys("pluralsight"); 
		*/
		 WebElement element = driver.findElement(By.name("q"));
         element.sendKeys("Pluralsight");
         element.submit();
	}

}
