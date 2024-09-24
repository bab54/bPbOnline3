package PageObject;

import CucumberManager.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver)
    {
        super(driver);
        this.driver = driver;
    }

    By myAccountButton  = By.xpath("//span[contains(text(),'My Account')]");
    By emailField = By.xpath("//input[@name='email_address']");
    By password = By.xpath("//input[@name='password']");
    By signInButton = By.xpath("//span[contains(text(),'Sign In')]");

    public  void ClickMyAccountButton()
    {
        driver.findElement(myAccountButton).click();
    }
    public void EnterEmailField(String Email)
    {
        driver.findElement(emailField).sendKeys(Email);
    }
    public void EnterPasswordField(String Password)
    {
        driver.findElement(password).sendKeys(Password);
    }
    public  void ClickSignInButton()
    {
        driver.findElement(signInButton).click();
    }
}
