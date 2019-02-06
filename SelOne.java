package first;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelOne {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 // to connect to chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ar52\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		String search_ta = "DXC";
		int sleep_value = 2000;
		
		WebElement search = driver.findElement(By.name("q")); 
//driver.close();
		//driver.findElement(By.name("q")).sendKeys("DXC");
		//Thread.sleep(2000);
		//driver.findElement(By.name("q")).clear();
		//Thread.sleep(2000);
		boolean visible = false;
		search.sendKeys(search_ta);
		Thread.sleep(sleep_value);
		//driver.findElement(By.name("btnK")).click();   // chk with if else
		Thread.sleep(sleep_value);
		try {
			
		 visible = driver.findElement(By.name("btnk")).isDisplayed();
		
		}
		catch (Exception e) {
			e.printStackTrace();
		
		}
		System.out.println(visible);
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(sleep_value);
		driver.findElement(By.partialLinkText("DXC Technology: Global IT Services and Solutions Leader")).click();	
		Thread.sleep(sleep_value);
	   driver.close();
		
	}
} 