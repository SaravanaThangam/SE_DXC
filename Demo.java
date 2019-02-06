package Demo;
 
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
 

 
// Initialize browser
WebDriver driver=new ChromeDriver();
 
// Open Google
driver.get("http://www.google.com");
 
// Close browser
driver.close();
}
}