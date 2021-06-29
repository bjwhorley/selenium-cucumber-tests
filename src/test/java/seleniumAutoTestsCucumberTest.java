import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class seleniumAutoTestsCucumberTest extends seleniumAutoTestsCucumber {

    @BeforeMethod
    public void setUp() {
        System.out.println("Being test");
    }

    @Test
    public void test() throws Exception{
        goToTestSite();
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Ending Test");
    }

}