package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().version("79").setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://google.com");
        Thread.sleep(3000);
        
        
        
        // this is a commit

        driver.quit();











    }
}
