package demo;
//ctrl+shift+I
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class helloo {

              public static void main(String[] args) throws InterruptedException {
                                 
        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\st34\\\\Downloads\\\\chromedriver\\\\chromedriver.exe");
        
        ChromeDriver driver = new ChromeDriver();   //can connect to chrome browser
                  driver.get("https://www.google.com");
                  
                //  driver.close();              //to close chrome
//   driver.findElement(By.name("p")).sendKeys("DXC");
//   driver.findElement(By.name("p")).clear();
//                  Thread.sleep(2000);
                  String search_tag ="DXC";
                  int sleep_value = 2000;
                  WebElement search = driver.findElement(By.name("q"));
                  
//               search.sendKeys(search_tag);
//               Thread.sleep(sleep_value);
//               
//               search.clear();
//               Thread.sleep(sleep_value);
                  
                  search.sendKeys(search_tag);    //send keys is for input
                  Thread.sleep(sleep_value);
                  
                  boolean visible = driver.findElement(By.name("btnK")).isDisplayed();
                  System.out.println(visible);
                  
    
//               driver.findElement(By.tagName("input"));
                  
                  driver.findElement(By.name("btnK")).click();      //if button then click
                  driver.findElement(By.partialLinkText("DXC Technology: Global IT Services and Solutions Leader")).click();
                  Thread.sleep(sleep_value);
                  driver.close(); 
                  
              }

}
