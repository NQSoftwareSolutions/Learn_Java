package selenium.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.lang.model.element.Element;

/**Todo #1
 * Todo what is selenium?
 * selenium is an opensource browser automation testing tool in the form of API's.
 * Selenium support multiple languages (Java, Python, C#, Ruby JS etc)
 * Selenium only support web applications (Any URL based application).
 * Selenium support multiple browsers (Chrome, Firefox and so on)
 * Selenium is very light weight software.
 * Selenium is platform independent
 * Selenium competitor is Qtp(Licenced by HP)
 *
 * def:
 *      Selenium is an open-source umbrella project for a range of tools and
 *      libraries aimed at supporting web browser automation.
 *      Selenium provides a playback tool for authoring functional tests
 *      without the need to learn a test scripting language.
 *
 * Todo Selenium components?
 * Selenium has four major components:
 *      1.Record & Play (Selenium IDE):
 *          Selenium IDE (Integrated Development Environment) is primarily a
 *          record/run tool that a test case developer uses to develop Selenium
 *          Test cases.
 *      2.Selenium RC (Remote Control) Now deprecated:
 *          Selenium RC is an important component in the Selenium test suite.
 *          It is a testing framework that enables a QA or a developer to write
 *          test cases in any programming language in order to automate UI tests
 *          for web applications against any HTTP website.
 *      3.Selenium web driver:
 *          Selenium Webdriver is an open-source collection of APIs which is
 *          used for testing web applications. The Selenium Webdriver tool is
 *          used for automating web application testing to verify that it works
 *          as expected or not. It mainly supports browsers like Firefox, Chrome,
 *          Safari and Internet Explorer.
 *          It also permits you to execute cross-browser testing.
 *
 *          WebDriver also enables you to use a programming language in creating your
 *          test scripts (not possible in Selenium IDE).
 */
public class SeleniumBasic {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\drivers\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://google.com/");
        String key = "Feroz Bughio";
        String searchFieldXpath = "//input[@title='Search']";
        WebElement searchField =  driver.findElement(By.xpath(searchFieldXpath));
        searchField.click();
        searchField.sendKeys(key);
        String searchBtnXpath = "(//input[@type='submit'])[3]";
        WebElement searchBtn = driver.findElement(By.xpath(searchBtnXpath));
        searchBtn.click();
    }
}
