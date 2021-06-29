import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumAutoTestsCucumber {
   // public static WebDriver driver = new ChromeDriver();

    public static void goToTestSite() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(500);
        driver.get("https://www.espn.com/");
    }
}
