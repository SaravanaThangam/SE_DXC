import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEmo_se {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		String search_tag = "DXC";
		int sleep_value = 2000;
		
		WebElement search = driver.findElement(By.name("q"));
		
//		driver.findElement(By.name("q")).sendKeys(search_tag);
		search.sendKeys(search_tag);
		Thread.sleep(sleep_value);
		
		
		driver.findElement(By.name("q")).clear();
		Thread.sleep(sleep_value);
		driver.findElement(By.name("q")).sendKeys(search_tag);
		Thread.sleep(sleep_value);
//		driver.findElement(By.name("btnK")).click();
		
		
		boolean visible = driver.findElement(By.name("btnK")).isDisplayed();
		System.out.println(visible);
		
		
		driver.findElement(By.name("btnK")).clear();
		
		
		driver.findElement(By.partialLinkText("DXC Technology : Global"));
		
		
		
//		driver.close();
		
		
	}

}
