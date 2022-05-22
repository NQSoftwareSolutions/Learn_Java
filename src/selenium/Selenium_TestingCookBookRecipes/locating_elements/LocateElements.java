package selenium.Selenium_TestingCookBookRecipes.locating_elements;

import org.openqa.selenium.chrome.ChromeDriver;
import selenium.config.Config;
import selenium.wrappers.MySelenium;
import java.util.concurrent.TimeUnit;

/**Todo By.id
 * Unique & static Id strategy is most preferable fastest way to locate any element on DOM.
 * *Todo By.xpath
 * Xpath is most commonly used strategy for locating elements b/c we can find any
 * element by creating xpath with combinations of other element attributed also.
 * Xpath is slower strategy then ID stategy
 */
public class LocateElements extends Config {
    public static void main(String[] args) throws InterruptedException {
        String loginBtnXpath = "//div[@id='loginactioncontainer']//a[@id='w3loginbtn']";

        MySelenium selenium = new MySelenium();

        ChromeDriver mChromeDriver = selenium.getDriver(Config.PAGE_URL);
        assert mChromeDriver != null;
        mChromeDriver.manage().window().maximize();
        selenium.clickElement(mChromeDriver, loginBtnXpath);
        mChromeDriver.manage().timeouts().getImplicitWaitTimeout();

        mChromeDriver.close();
    }
}
