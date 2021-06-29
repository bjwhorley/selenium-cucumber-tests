import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumAutoTestsCucumber {
    public static WebDriver driver = new ChromeDriver();
    
    public static void goToTestSite(){
        driver.get("www.espn.com");

    }
}
