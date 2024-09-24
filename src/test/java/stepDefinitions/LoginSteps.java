package stepDefinitions;

import PageObject.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginSteps {
    public WebDriver driver;
    public LoginPage loginPage;

    @Given("i navigate to bPbOnline website")
    public void iNavigateToBPbOnlineWebsite() {
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        loginPage.goToUrl();

    }

    @And("i click on my Account")
    public void iClickOnMyAccount() {
    loginPage.ClickMyAccountButton();
    }


    @And("i enter my username {string}")
    public void iEnterMyUsername(String Email) {
        loginPage.EnterEmailField(Email);
    }

    @And("i enter my password {string}")
    public void iEnterMyPassword(String Password) {
        loginPage.EnterPasswordField(Password);
    }

    @When("i click on Sigin button")
    public void iClickOnSiginButton() {
        loginPage.ClickSignInButton();
    }

    @Then("i should be loged in with the message {string}")
    public void iShouldBeLogedInWithTheMessage(String validationMessage) {
        Assert.assertEquals(validationMessage , driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/h1")).getText());
    }
}
