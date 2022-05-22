package selenium.wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.config.Config;

public class MySelenium extends Config {
    public WebElement locateElement(ChromeDriver driver, String xpath){
        WebElement element;
        try{
            element = driver.findElement(By.xpath(xpath));
            return element;
        }catch (Exception e){
            System.out.println(e+"\nElement not found with xpath : "+xpath);
            return null;
        }
    }

    public void loadPageUrl(ChromeDriver driver, String URL){
        try{
            driver.get(URL);
            driver.manage().timeouts().getPageLoadTimeout();
            System.out.println("Page loaded Successfully...");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e+"\nPage not load");
            }
    }

    public ChromeDriver getDriver (String pageUrl){
        ChromeDriver driver;
        try{
            System.setProperty(DRIVER_KEY, DRIVER_ADDRESS);
            driver = new ChromeDriver();
            loadPageUrl(driver, pageUrl);
            return driver;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(""+e);
            return null;
        }
    }

    public void clickElement(ChromeDriver driver, String xpath){
        try{
            WebElement element = locateElement(driver, xpath);
            if (element != null) {
                element.click();
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e+"\nElement not found with xpath: "+xpath);
        }
    }

    public void sendKeys(ChromeDriver driver, String xpath){
        try{
            WebElement element = locateElement(driver, xpath);
            if (element != null) {
                element.click();
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e+"\nElement not found with xpath: "+xpath);
        }
    }
}
