import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumAutoTestsCucumber {
    //public static WebDriver driver = new ChromeDriver();
    public static WebDriver driver = new ChromeDriver();
    // public static WebElement = null;

    //Given The user is on the login page
    @Given("The user is on the login page")
    public static void goToTestSite() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        Thread.sleep(500);
        driver.get("http://www.seleniumframework.com/Practiceform/");


    }

        @When("the user enters email address in textbox")
        public static void enterEmail() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

            Thread.sleep(500);
            WebElement email_box = driver.findElement(By.xpath("(//input[contains(@name,'email')])[1]"));
            System.out.println("Clicking email input box");
            email_box.sendKeys("bwhorley76@yahoo.com");
        }

        @Then("the user hits subscribes by clicking subscribe")
        public static void clickButton() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
            driver.findElement(By.xpath("//input[contains(@value,'Subscribe')]")).click();
            Thread.sleep(500);
            String selenium_link = driver.findElement(By.xpath("//span[contains(.,'SELENIUM')]")).getText();
            driver.findElement(By.xpath("//span[contains(.,'SELENIUM')]")).click();
            System.out.println(selenium_link);
            driver.quit();

        }
    }
