package CucumberManager;

import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;
    public BasePage(WebDriver driver)
    {
        this.driver = driver;
    }
    public  void goToUrl()
    {
        String url = "https://practice.bpbonline.com/";
        driver.get(url);
    }

}
