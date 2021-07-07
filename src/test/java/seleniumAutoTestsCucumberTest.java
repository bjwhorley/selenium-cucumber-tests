import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class seleniumAutoTestsCucumberTest extends seleniumAutoTestsCucumber {

    @BeforeMethod
    public void setUp() throws InterruptedException {
        System.out.println("Beginning test");
        goToTestSite();
    }

    @Test
    public void test() throws Exception{
        enterEmail();
        clickButton();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        System.out.println("Ending Test");
        Thread.sleep(500);

    }

}