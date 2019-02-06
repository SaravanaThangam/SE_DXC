package New_Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		String search_tag = "DXC";
		int sleep_value=2000;
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys(search_tag);
		Thread.sleep(sleep_value);
		search.clear();
		Thread.sleep(sleep_value);
		search.sendKeys(search_tag);
		Thread.sleep(sleep_value);
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.tagName("input"));
		driver.findElement(By.partialLinkText("DXC Technology: Global IT Services and Solutions Leader")).click();
		Thread.sleep(sleep_value);
		
		//driver.close();
		}
}
